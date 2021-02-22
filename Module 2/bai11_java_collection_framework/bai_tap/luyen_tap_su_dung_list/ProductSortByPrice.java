package C1020G1.java_collection_framework.bai_tap.luyen_tap_su_dung_list;

import java.util.Comparator;

public class ProductSortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice() ;
    }
}
