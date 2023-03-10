package Models;

import java.time.LocalDate;
import java.util.Date;

public interface Stock {

  String getStockName();

  float getQuantity();

  LocalDate getPurchaseDate();

  float getPurchaseValue();

  float getValue(LocalDate d);

  String getStockSymbol();
}
