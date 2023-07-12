class G {
    public void iWannaLoveAnushkaButIthinkSheLovesSomeoneElse() {
        System.out.println("such a cutie but not mine");
    }

}

class j extends G {
    public void iWannaLoveAnushkaButIthinkSheLovesSomeoneElse() {
        System.out.println("such a cutie but not mine");
    }
}

public class annonatio{
    public static void main(String[] args) {
        G obj = new j();
        obj.iWannaLoveAnushkaButIthinkSheLovesSomeoneElse();

    }
}
