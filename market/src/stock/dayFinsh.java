package stock;

import market.market.menu;
import market.market.MenuItem;

public class dayFinsh {

    public static void dayFinsh() {
        for (MenuItem item : menu.getMenuList()) {
            item.addStock(1);
        }
       
    }
}
