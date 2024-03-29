package KarakterRegistreringsSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class OPG2 {

    /**
     * @param args
     */
    static Connection minConnection;
    static Statement stmt;
    static BufferedReader inLine;

    public static void selectudenparm() {
        try {
            // Laver sql-sætning og får den udført
            String sql = "select * from rytter ";
            System.out.println("SQL-streng er " + sql);
            ResultSet res = stmt.executeQuery(sql);
            // gennemløber svaret
            while (res.next()) {
                String s;
                s = res.getString("init");
                System.out.println(s + "    " + res.getString(2));
            }
            // pæn lukning
            if (!minConnection.isClosed()) minConnection.close();
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void selectmedparm() {
        try {
            // Indlæser søgestreng
            System.out.println("Indtast søgestreng");
            String inString = inLine.readLine();
            // Laver sql-sætning og får den udført
            String sql = "select navn,stilling from person where navn like '" + inString + "%'";
            System.out.println("SQL-streng er " + sql);
            ResultSet res = stmt.executeQuery(sql);
            //gennemløber svaret
            while (res.next()) {
                System.out.println(res.getString(1) + "    " + res.getString(2));
            }
            // pæn lukning
            if (!minConnection.isClosed()) minConnection.close();
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void insertmedstring() {
        try {
            // indlæsning
            System.out.println("Vi vil nu oprette et nyt ansættelsesfforhold");
            System.out.println("Indtast cpr (personen skal være oprettet på forhånd");
            String cprstr = inLine.readLine();
            System.out.println("Indtast firmanr (firma skal være oprettet på forhånd");
            String firmastr = inLine.readLine();

            // sender insert'en til db-serveren
            String sql = "insert into ansati values ('" + cprstr + "'," + firmastr + ")";
            System.out.println("SQL-streng er " + sql);
            stmt.execute(sql);
            // pænt svar til brugeren
            System.out.println("Ansættelsen er nu registreret");
            if (!minConnection.isClosed()) minConnection.close();
        } catch (SQLException e) {
            switch (e.getErrorCode())
            // fejl-kode 547 svarer til en foreign key fejl
            {
                case 547: {
                    if (e.getMessage().contains("cprforeign"))
                        System.out.println("cpr-nummer er ikke oprettet");
                    else if (e.getMessage().contains("firmaforeign"))
                        System.out.println("firmaet er ikke oprettet");
                    else
                        System.out.println("ukendt fremmednøglefejl");
                    break;
                }
                // fejl-kode 2627 svarer til primary key fejl
                case 2627: {
                    System.out.println("den pågældende ansættelse er allerede oprettet");
                    break;
                }
                default:
                    System.out.println("fejlSQL:  " + e.getMessage());
            }
            ;
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    ;

    public static void insertprepared() {
        try {
            // indl�sning
            System.out.println("Vi vil nu oprette et nyt ansættelsesforhold");
            System.out.println("Indtast cpr (personen skal være oprettet på forhånd");
            String cprstr = inLine.readLine();
            System.out.println("Indtast firmanr (firma skal være oprettet på forhånd");
            String firmastr = inLine.readLine();
            // Anvendelse af prepared statement
            String sql = "insert into ansati values (?,?)";
            PreparedStatement prestmt = minConnection.prepareStatement(sql);
            prestmt.clearParameters();
            prestmt.setString(1, cprstr);
            prestmt.setInt(2, Integer.parseInt(firmastr));
            // Udf�rer s�tningen
            prestmt.execute();
            // p�nt svar til brugeren
            System.out.println("Ansættelsen er nu registreret");
            if (!minConnection.isClosed()) minConnection.close();
        } catch (SQLException e) {
            switch (e.getErrorCode())
            // fejl-kode 547 svarer til en foreign key fejl
            {
                case 547: {
                    if (e.getMessage().contains("cprforeign"))
                        System.out.println("cpr-nummer er ikke oprettet");
                    else if (e.getMessage().contains("firmaforeign"))
                        System.out.println("firmaet er ikke oprettet");
                    else
                        System.out.println("ukendt fremmednøglefejl");
                    break;
                }
                // fejl-kode 2627 svarer til primary key fejl
                case 2627: {
                    System.out.println("den pågældende ansættelse er allerede oprettet");
                    break;
                }
                default:
                    System.out.println("fejlSQL:  " + e.getMessage());
            }
            ;
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void eksamensAfvikling() {
        try {
            System.out.println("Skriv en startDato ");
            String startDato = inLine.readLine();
            System.out.println("Skriv en slutDato");
            String slutDato = inLine.readLine();
            System.out.println("Skriv en karakter");
            String karakter = inLine.readLine();
            System.out.println("Skriv et eksamensForsøgID");
            String eksamensForsøgID = inLine.readLine();
            System.out.println("Skriv en studerendes ID");
            String studerendeID = inLine.readLine();
            System.out.println("Skriv et eksamensID");
            String eksamensID = inLine.readLine();

            String sql = "INSERT INTO eksamensForsøg VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = minConnection.prepareStatement(sql)) {
                preparedStatement.setString(1, startDato);
                preparedStatement.setString(2, slutDato);
                preparedStatement.setString(3, karakter);
                preparedStatement.setString(4, eksamensForsøgID);
                preparedStatement.setString(5, studerendeID);
                preparedStatement.setString(6, eksamensID);
                preparedStatement.executeUpdate();

                System.out.println("Eksamensafvikling er blevet oprettet.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            inLine = new BufferedReader(new InputStreamReader(System.in));
            //generel opsætning
            //via native driver
            String server = "localhost"; //virker måske hos dig
            //virker det ikke - prøv kun med localhost
            String dbnavn = "Karakterregistreringssystem";            //virker måske hos dig
            String login = "sa";                     //skal ikke ændres
            String password = "Pinjata4513";            //skal ændres
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            minConnection = DriverManager.getConnection("jdbc:sqlserver://" + server + ";databaseName=" + dbnavn +
                    ";user=" + login + ";password=" + password + ";");
            stmt = minConnection.createStatement();

            //Indlæsning og kald af den rigtige metode
            System.out.println("Indtast:");
            System.out.println("1 for at oprette en eksamensafvikling");
            System.out.println("2 for at udføre en anden handling");
            int choice = Integer.parseInt(inLine.readLine());

            switch (choice) {
                case 1:
                    eksamensAfvikling();
                    break;
                default:
                    System.out.println("Ukendt indtastning");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

