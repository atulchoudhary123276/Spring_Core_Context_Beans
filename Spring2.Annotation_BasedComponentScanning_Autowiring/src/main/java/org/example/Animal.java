package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
      private AnimalType animal;

//      public Animal() {
//      }

      public Animal(AnimalType animal) {
            this.animal = animal;
      }

       //AutoWiring takes place in filed,constructor and setter
      //inject bean according by autowire 1.Type ,2.name or 3.make one primary
//      @Autowired()                 //1. BY Type
//      public void setAnimal(Dog dog){
//            this.animal=dog;
//      }
      @Autowired()                 //2. BY name matching in small case: like cat
      public void setAnimal(AnimalType cat){
            this.animal=cat;
      }
//                            //3. By Primary Annotation in only one class
//      @Autowired()
//      public void setAnimal(AnimalType animal){
//            this.animal=animal;
//      }
      void getSound(){
            animal.sound();
      }
      String  getMyName(){
            return animal.getMyname();
      }

}
