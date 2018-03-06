package observer;

import java.util.ArrayList;
import java.util.List;

    /**
     * Interface for Observer which will be implemented by handler. It will define one method with args
     * which will be called when 'subject' changes
     */
    interface Observer {
        public void update();
    }

    /**
     * Handler which will handle the command which will run when subscriber will notify
     */

    class Handler implements observer.Observer {

        @Override
        public void update() {
            System.out.println("Got 2");
        }

    }

    /**
     * Interface for "Subject". It will defines 3 methods: addObserver(Observer o), removeObserver(Observer o)
     * and notify()
     */
    interface Subject {
        public void notifyHim();

        public void addObserver(observer.Observer o);

        public void removeObserver(observer.Observer o);
    }

    /**
     * Class which will be act as subject.
     */
    class Calculator implements observer.Subject {


        List<observer.Observer> list = null;

        public Calculator() {
            list = new ArrayList<>();
        }

        void calculator() {
            for (int i = 1; i < 100; i+=3) {
                System.out.println(i);
                if (i == 22) {
                    notifyHim();
                }
            }
        }

        @Override
        public void notifyHim() {
            for (observer.Observer o : list) {
                o.update();
            }
        }

        @Override
        public void addObserver(observer.Observer o) {
            list.add(o);
        }

        @Override
        public void removeObserver(observer.Observer o) {
        }

    }

