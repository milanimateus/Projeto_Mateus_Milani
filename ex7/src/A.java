public class A {
    private int a1;
    private float a2;
    
    public A(int a1, float a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    public int getA1(){
        return a1;
    }

    public float getA2(){
        return a2;
    }

    public void ma1(){
        System.out.println("Nome do Método: ma1");
    }

    public void ma2(){
        System.out.println("Nome do Método: ma2");
    }
    
    public void ma3(){
        System.out.println("Alterando a classe A e inserindo o método ma3");
    }
    
}
