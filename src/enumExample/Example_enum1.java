package enumExample;

public class Example_enum1 {
enum WeekDays{
    sun,mon,tues,wed,thurs,fri,sat;
    //these are enum constants
    //public,static and final
    //since it is final,you can create child enum
    //type is weekDays
    WeekDays (){   // special case : when creating a constructor under enum
        System.out.println("constructor called for "+this);
    }
    //this is not public or protected, only private or default
    //why? we don't want to create new objects
    // (enums are constants,if we have 'months' enum, we can have only 12 objects.)
    //


    //internally it is like : public static final WeekDays day=new WeekDays();
}


    public static void main(String[] args) {
        WeekDays wd;
        wd= WeekDays.fri;

//        for (WeekDays day:WeekDays.values()){
//            System.out.println(day);
        System.out.println(wd.hashCode());
//        }
    }
}
