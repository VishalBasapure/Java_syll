class VarDemo{
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        for (int [] item :a){
            for (int row:item)
                System.out.println(row);
            System.out.println();
        }
    }}