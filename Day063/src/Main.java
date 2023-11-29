public class Main {
    private sealed interface Animal permits Dog, Cat {
        void speak();
    }

    private static non-sealed class Dog implements Animal {

        @Override
        public void speak() {
            System.out.println("Woof");
        }
    }

    private static final class Cat implements Animal {

        @Override
        public void speak() {
            System.out.println("Meow");
        }
    }

    private static class Bird implements Animal { // Error: Bird is not allowed in the sealed hierarchy

        @Override
        public void speak() {
            System.out.println("Pew");
        }
    }
}