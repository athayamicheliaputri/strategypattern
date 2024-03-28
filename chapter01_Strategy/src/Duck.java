interface QuackBehavior {
    void quack();
}

interface FlyBehavior {
    void fly();
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwek-qwek");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Tidak bisa bersuara");
    }
}


class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Terbang");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Tidak bisa terbang");
    }
}

class FlyWithRocketPower implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cool, terbang menggunakanrocket");
    }
}

abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    abstract void diplay();

    void swim() {
        System.out.println("Berenang");
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack(FlyWithRocketPower flyWithRocketPower) {
    }
}

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void diplay() {
        System.out.println("Tampilan MallardDuck");
    }
}

abstract class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void diplay() {
        System.out.println("Tampilan RedheadDuck");
    }
}

abstract class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    void diplay() {
        System.out.println("Tampilan RubberDuck");
    }
}

abstract class WoodenDuck extends Duck {
    public WoodenDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    void diplay() {
        System.out.println("Tampilan WoodenDuck");
    }
}

class ModelDuck extends Duck {
    ModelDuck(){
        flyBehavior = new  FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void diplay() {
        System.out.println("Tampilan ModelDuck");
    }
}
