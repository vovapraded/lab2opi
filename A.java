class A {
  int t2;
  int t34;
  int t22;
  int t14;
  int t13;
  long t25;
  long t20;
  long t33;
  int[] t26 = {3, -1, -3, -1};
  int[] t30 = {2, -2, 2, -3, -1};
  int[] t17 = {1, 0, 3, 2};
  static int t37;
  static int t3;
  static int t39;
  static int t8;
  static int t27;
  public A() {
    t2 = 0;
    t34 = 3;
    t22 = 8;
    t14 = 1;
    t13 = 0;
    t25 = 8L;
    t20 = 3L;
    t33 = 7L;
  }
  public void t31() {
    System.out.println("метод t31 в классе A");
    System.out.println(t13--);
  }
  public void t1() {
    System.out.println("метод t1 в классе A");
    System.out.println((int)t25);
  }
  public void t4() {
    System.out.println("метод t4 в классе A");
    System.out.println(t30[1]);
  }
  public void t23() {
    System.out.println("метод t23 в классе A");
    System.out.println(--t37);
  }
  public void t36() {
    System.out.println("метод t36 в классе A");
    System.out.println(t2);
  }
  public void t15() {
    System.out.println("метод t15 в классе A");
    System.out.println(t14--);
  }
  public static void t21() {
    System.out.println("метод t21 в классе A");
    System.out.println(t8);
  }
  public static void t19() {
    System.out.println("метод t19 в классе A");
    System.out.println((t8 + 3));
  }
  public static void t10() {
    System.out.println("метод t10 в классе A");
    System.out.println(t27);
  }
  public static void t5() {
    System.out.println("метод t5 в классе A");
    System.out.println((t27 - 3));
  }
  public void t9(A r) {
    r.t31();
  }
  public void t9(E r) {
    r.t1();
  }
}
