import model.Lift;

import java.util.Scanner;

public class LiftSystem {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Lift lifts[] = new Lift[5];
        createLift(lifts);

        do{
            int currentFloor, destinationFloor;
            System.out.print("Enter the current floor : ");
            currentFloor = sc.nextInt();
            System.out.print("Enter the destination floor : ");
            destinationFloor = sc.nextInt();
            chooseList(currentFloor, destinationFloor, lifts);
            print(lifts);
            System.out.println("Do you want to continue : y/n");
            char conti = sc.next().charAt(0);
            if(conti == 'n' || conti == 'N'){
                System.out.println("thank you");
                break;
            }
        }while(true);

    }

    public static void print(Lift arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%-2s%s",arr[i].getName() , " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%-2d%s",arr[i].getFloor() , " ");
        }
        System.out.println();
    }

    public static void des1_5(int currFloor, int destFloor, Lift lifts[]){
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < lifts.length; i++){
            if(lifts[i].getFloor() == -1) continue;
            if(lifts[i].getNoOfPeople() < lifts[i].getCapacity()){
                if(i > 1) continue;
                int diff = Math.abs(currFloor - lifts[i].getFloor());
                if(diff < minDistance){
                    minDistance = diff;
                    index = i;
                }else if(diff == minDistance){
                    if(lifts[i].getFloor() > currFloor && (lifts[i].getFloor() == lifts[index].getFloor())){
                        if(lifts[i].getNoOfStops() < lifts[index].getNoOfStops()){
                            index = i;
                        }
                    }else if(lifts[i].getFloor() < currFloor && (lifts[i].getFloor() == lifts[index].getFloor())){
                        if(lifts[i].getNoOfStops() < lifts[index].getNoOfStops()){
                            index = i;
                        }
                    }else if(lifts[i].getFloor() > currFloor){
                        index = i;
                    }
                }
            }
        }
        if(index == -1){
            System.out.println("lift not available");
            return;
        }
        lifts[index].setFloor(destFloor);
        System.out.println(lifts[index].getName() + " is assigned");
        lifts[index].setNoOfPeople(lifts[index].getNoOfPeople() + 1);
    }

    public static void des0(int currFloor, int destFloor, Lift lifts[]){
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < lifts.length; i++){
            if(lifts[i].getFloor() == -1) continue;
            if(lifts[i].getNoOfPeople() < lifts[i].getCapacity()){
                int diff = Math.abs(currFloor - lifts[i].getFloor());
                if(diff < minDistance){
                    minDistance = diff;
                    index = i;
                }else if(diff == minDistance){
                    if(lifts[i].getFloor() > currFloor && (lifts[i].getFloor() == lifts[index].getFloor())){
                        if(lifts[i].getNoOfStops() < lifts[index].getNoOfStops()){
                            index = i;
                        }
                    }else if(lifts[i].getFloor() < currFloor && (lifts[i].getFloor() == lifts[index].getFloor())){
                        if(lifts[i].getNoOfStops() < lifts[index].getNoOfStops()){
                            index = i;
                        }
                    }else if(lifts[i].getFloor() > currFloor){
                        index = i;
                    }
                }
            }
        }
        if(index == -1){
            System.out.println("lift not available");
            return;
        }
        lifts[index].setFloor(destFloor);
        System.out.println(lifts[index].getName() + " is assigned");
        lifts[index].setNoOfPeople(lifts[index].getNoOfPeople() + 1);
    }

    public static void des6_10(int currFloor, int destFloor, Lift lifts[]){
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < lifts.length; i++){
            if(lifts[i].getFloor() == -1) continue;
            if(lifts[i].getNoOfPeople() < lifts[i].getCapacity()){
                if(i >= 2 && i <= 4){
                    int diff = Math.abs(currFloor - lifts[i].getFloor());
                    if(diff < minDistance){
                        minDistance = diff;
                        index = i;
                    }else if(diff == minDistance){
                        if(lifts[i].getFloor() > currFloor && (lifts[i].getFloor() == lifts[index].getFloor())){
                            if(lifts[i].getNoOfStops() < lifts[index].getNoOfStops()){
                                index = i;
                            }
                        }else if(lifts[i].getFloor() < currFloor && (lifts[i].getFloor() == lifts[index].getFloor())){
                            if(lifts[i].getNoOfStops() < lifts[index].getNoOfStops()){
                                index = i;
                            }
                        }else if(lifts[i].getFloor() > currFloor){
                            index = i;
                        }
                    }
                }
            }
        }
        if(index == -1){
            System.out.println("lift not available");
            return;
        }
        lifts[index].setFloor(destFloor);
        System.out.println(lifts[index].getName() + " is assigned");
        lifts[index].setNoOfPeople(lifts[index].getNoOfPeople() + 1);
    }

    public static void chooseList(int currFloor, int destFloor, Lift liftFloor[]){
        if(destFloor == 0){
            des0(currFloor, destFloor, liftFloor);
        } else if (destFloor >= 1 && destFloor <= 5) {
            des1_5(currFloor, destFloor, liftFloor);
        }else{
            des6_10(currFloor, destFloor, liftFloor);
        }
    }

    public static void createLift(Lift lifts[]){
        System.out.println("Enter the floor for lift one : ");
        int floor1 = sc.nextInt();
        lifts[0] = new Lift("l1", floor1, 1, 1, 0);
        System.out.println("Enter the floor for lift two : ");
        int floor2 = sc.nextInt();
        lifts[1] = new Lift("l2", floor2, 5, 1, 0);
        System.out.println("Enter the floor for lift three : ");
        int floor3 = sc.nextInt();
        lifts[2] = new Lift("l3", floor3, 1, 5, 0);
        System.out.println("Enter the floor for lift four : ");
        int floor4 = sc.nextInt();
        lifts[3] = new Lift("l4", floor4, 4, 5, 0);
        System.out.println("Enter the floor for lift five : ");
        int floor5 = sc.nextInt();
        lifts[4] = new Lift("l5" ,floor5, 2, 5, 0);
    }
}
