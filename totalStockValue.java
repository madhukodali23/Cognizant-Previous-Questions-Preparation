
class Main {
    public static int totalStockValue(String s)
    {
        int n = s.length();
        String products[] = s.split(";"); 
        int totalSum = 0;
        for(String k : products)
        {
            String pricesAndQuantity[] = k.split(":");
            if (pricesAndQuantity.length >= 3)
            {
            int price = Integer.parseInt(pricesAndQuantity[1]);
        int quantity = Integer.parseInt(pricesAndQuantity[2]);
        totalSum += price * quantity;
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        String s = "Apple:250:10;Banana:120:15;Orange:300:5";
        int temp = totalStockValue(s);
        System.out.println(temp);
    }
}
