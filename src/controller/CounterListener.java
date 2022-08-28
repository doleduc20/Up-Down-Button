package controller;

import view.CounterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CounterListener implements ActionListener {
    private CounterView counterView;
    public CounterListener(CounterView counterView){
        this.counterView = counterView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Up")){
            this.counterView.num_Up();
        }else if(src.equals("Down")){
            this.counterView.num_Down();
        }else if(src.equals("Reset")){
            this.counterView.num_reset();
        }
        
    }
    
            
    
  
}
