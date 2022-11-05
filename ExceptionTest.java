import java.util.ArrayList;

public class ExceptionTest{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("12");
        myList.add("HolyDiverrrrrruugh!");
        myList.add(45);
        myList.add("so long cruel world");


        for (int i = 0; i < myList.size(); i++){
            try{;
                Integer castedVal = (Integer) myList.get(i);
                System.out.println(castedVal);
            }catch (ClassCastException e) {
            System.out.println(String.format("the index for the value %s located at index %s cannot be type cast to an integer",myList.get(i), i));
        } 


    }
}
}