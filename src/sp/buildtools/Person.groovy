package sp.buildtools


class Person {
    String name
    Integer age

    Person (name, age){
      this.name = name
      this.age = age
    }
    def increaseAge(Integer years) {
        this.age += years
    }
}
