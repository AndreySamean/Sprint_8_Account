public class Praktikum {

    public static void main(String[] args) {

        String testedName = "Тимоти Шаламе";
        Account account = new Account(testedName);
        System.out.println(account.checkNameToEmboss());
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}