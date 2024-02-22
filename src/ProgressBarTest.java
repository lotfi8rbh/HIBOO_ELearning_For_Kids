// Importing the 'awt' and 'swing' package that contains  
// useful classes for Java Progress Bar  
import java.awt.* ;  
import javax.swing.* ;  
import java.awt.event.* ;  
// JFrame class is a container type which inherits the   
// java.awt.Frame class. It acts as the main window   
// containing components like labels, buttons, progress bars  
// to create a Graphical User Interface.  
public class ProgressBarTest extends JFrame {  
   
    // instantiating the frame  
    static JFrame f ;  
    // instantiating the JProgressBar class used to display   
    // the progress of the task.  
    static JProgressBar b ;  
   
    public static void main( String[ ] args )  
    {  
        // creating a frame using the JFrame Constructor  
        f = new JFrame( " Progress Bar " ) ;  
   
        // creating a panel using the JPanel class. It provides   
        // space in which an application can attach any other component.  
        JPanel p = new JPanel( ) ;  
   
        // creating a progress bar using JProgressBar constructor  
        b = new JProgressBar( ) ;  
   
        // setting the initial value to 0  
        b.setValue( 0 ) ;  
       // setting StringPainted to true to make the progress bar   
       // render a string  
        b.setStringPainted( true ) ;  
   
        // add a progressbar using add( ) function  
        p.add( b ) ;  
   
        // add a panel using add( ) function   
        f.add( p ) ;  
   
        // set the size of the frame  
        f.setSize( 200, 150 ) ;  
        f.setVisible( true ) ;  
       // calling the fill( ) method  
        fill( ) ;  
    }  
   
    // function to dynamically increase progress  
    public static void fill( )  
    {  
        int i = 0 ;  
        try {  
            while ( i <= 100 ) {  
                // fill the menu bar to the defined value using   
                // the setValue( ) method  
                b.setValue( i + 5 ) ;  
   
                // delay the thread by 1000 ms  
                Thread.sleep( 1000 ) ;  
                // increasing the progress every time by 10%  
                i += 10 ;  
            }  
        }  
        catch ( Exception e ) {  
          System.out.println( e ) ;    
      }  
    }  
}  