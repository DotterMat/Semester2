package Opg4;

import java.util.ArrayList;

public interface Discount {

   public default double getDiscount(double price) {
      return price;
   }

   double discountedPrice(double price);

}
