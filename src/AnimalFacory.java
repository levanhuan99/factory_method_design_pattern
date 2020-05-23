public class AnimalFacory {
   //kiểm tra xem khởi tạo của Animal tạo nên là thuộc chó hay mèo thì sẽ khởi tạo đối tượng theo kiểu đó
    public Animal getAnimal(String name){
        if (name.equals("dog")){
            return new Dog();
        }else return new Cat();
    }
    //phương thức khởi tạo không tham số
}
