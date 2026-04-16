package ProblemsDay_312;

import java.util.ArrayList;
import java.util.List;

public class ProductLastKNumbers {

    //https://leetcode.com/problems/product-of-the-last-k-numbers/?envType=problem-list-v2&envId=array
    class ProductOfNumbers {
        List<Integer> listProduct;

        public ProductOfNumbers() {
            listProduct=new ArrayList();
            listProduct.add(1);
        }

        public void add(int num) {
            if(num==0){
                listProduct=new ArrayList();
                listProduct.add(1);
            }else{
                listProduct.add(listProduct.get(listProduct.size()-1)*num);
            }
        }

        public int getProduct(int k) {
            if(k>listProduct.size()-1){
                return 0;
            }
            else{
                return listProduct.get(listProduct.size()-1)/listProduct.get(listProduct.size()-1-k);
            }

        }
    }

    public static void main(String[] args) {

    }
}
