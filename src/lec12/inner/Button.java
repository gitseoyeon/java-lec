package lec12.inner;

public class Button {
    interface OnClickListener {
        void onClick();
    }

    private OnClickListener listener;

    // setter 역할
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if(listener != null){
            listener.onClick();
        }
    }

    private class ClickHandler implements OnClickListener { // 내부 클래스
        @Override
        public void onClick() {
            System.out.println("Button was clicked.");
        }
    }

    public void simulate() {
        setOnClickListener(new ClickHandler());
        click();
    }


    public static void main(String[] args) {
        Button btn = new Button();
        btn.simulate();
    }
}
