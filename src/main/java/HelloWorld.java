public class HelloWorld {

    public String sayHello(){
        return "Hello world";
    }
    public String sayHello(String text){
        if(text.equals("maxime")){
            text="boulet";
        }
        return text;
    }

    public String coucou(){
        return "ah que coucou";
    }

}
