package Day15_3_Interface.Exercise;

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        //编译不通过。因为x是不明确的
        // System.out.println(x);
        System.out.println(super.x);//1
        System.out.println(A.x);//0 // 此时x为全局常量，直接调用

    }

    public static void main(String[] args) {
        new C().pX();
    }
}
