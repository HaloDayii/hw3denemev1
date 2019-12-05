public class Factory {
    //purpose of Factory is turn to ingradients to product

    //produce boxed milk using milk
    public Product boxedMilk(Ingredient milk){
        Product boxedMilk = new Product();
        boxedMilk.setName(milk.getName());
        boxedMilk.setAmount(milk.getAmount());
        return boxedMilk;
    }
}
