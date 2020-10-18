package kostinich.android_hw1;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private static final DataSource ourInstance = new DataSource();
    private final List<NumberModel> list_of_numbers;

    private DataSource() {

        list_of_numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            int color;

            if (i % 2 == 1) {color = Color.BLUE;}
            else {color = Color.RED;}

            list_of_numbers.add(new NumberModel(i, color));
        }
    }

    public void addData(NumberModel model){ list_of_numbers.add(model);}

    public void addDataOnClick()
    {
        List<NumberModel> numbers = ourInstance.getData();
        NumberModel number = numbers.get(numbers.size()-1);

        int color;
        int Date = number.getNumber();

        if(Date % 2 == 1) { color = Color.RED;}
        else { color = Color.BLUE;}

        list_of_numbers.add(new NumberModel((Date+1),color));
    }

    static DataSource getInstance() {
        return ourInstance;
    }

    public List<NumberModel> getData() { return list_of_numbers;}

    public static class NumberModel {

        private int number;
        private int color;

        public NumberModel(int number, int color){
            this.number = number;
            this.color = color;
        }

        public int getNumber() { return number;}

        public int getColor() {return color;}
    }
}