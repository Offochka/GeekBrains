package Homework;

public class Plate {
    private  int food;
    private int plateVolume;

    public Plate(int plate, int food){ //обьем миски и кол-во еды
        this.plateVolume = plate;

        if (plate <= food) {
             this.food = food;
        }
        else {
            System.out.println("Миска слишком мала");
        }
    }

    public boolean checkFood (int ateFood) { //проверяем еду
        return ateFood <= food;
    }

    public void fallFood (int atefood) { // объем потребляемой еды
        if (atefood > food) {
            System.out.println("В миске нет столько еды");
        } else {
            food -= atefood;
        }
    }

    public void fullPlate() { //пополняем миску доверху
        this.food += (this.plateVolume - this.food);
        System.out.println("Миска наполнена");
        infoPlate();
    }

    public void infoPlate() { //информация о еде
            System.out.println("В миске осталось "+ food + " еды");
    }
}




