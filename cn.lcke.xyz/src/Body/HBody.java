package Body;

public class HBody {
    String name="name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {

        System.out.println("waibu");
    }

    //成员内部类
    public class div {
        String name="age";

        public String getName() {
            return name;
        }
        public String getoutName() {
            return   this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("neibu");
        }
    }

    public static void main(String[] args) {
        new HBody().new div().show();
    }
}
