package com.ultraLesson.objectOrientation.aggregation;
import java.util.ArrayList;
import java.util.List;

public class PencilBox {
    private List<Stationary>stationaries=new ArrayList<>();
public void addItem(Stationary stationary){
        this.stationaries.add(stationary);

}
public void show(){
    for(int i=0;i<stationaries.size();i++){
        System.out.println(stationaries.get(i));
    }
}

    public static void main(String[] args) {
        PencilBox pencilBox=new PencilBox();
        Scale scale=new Scale(4,3,2,7);
        Pencil pencil=new Pencil(4,3,"red",7);
        Sharpener sharpener=new Sharpener(1,2,3,"brown");
        pencilBox.addItem(scale);
       pencilBox.show();
       pencilBox.stationaries.clear();
        pencilBox.addItem(pencil);
        pencilBox.show();
        pencilBox.stationaries.clear();
        pencilBox.addItem(sharpener);
        pencilBox.show();
    }
}
