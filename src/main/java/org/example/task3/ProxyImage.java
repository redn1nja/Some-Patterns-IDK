package org.example.task3;

public class ProxyImage implements MyImage{
    private RealImage realImage = null;
    public void proxy(RealImage realImage){
        this.realImage = realImage;
    }

    public boolean checkAccess(){
        return realImage != null;
    }
    @Override
    public void display() {
        if (checkAccess()){
            realImage.display();
        }
    }
}
