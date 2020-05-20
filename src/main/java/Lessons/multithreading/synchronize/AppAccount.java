package Lessons.multithreading.synchronize;
/*
Сделать класс Account потокобезопасным. Методы:
deposit - пополняет счет на указанную сумму;
withdraw - списывает со счета указанную сумму если на
балансе достаточно средств;
getBalance - возвращает текущий баланс.
 */
public class AppAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(2500);
        System.out.println(account.getBalance());
    }
}
