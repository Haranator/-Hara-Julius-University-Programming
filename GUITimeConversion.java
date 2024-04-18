import javax.swing.JOptionPane;

class GUITimeConversion {
    public static void main(String[] args)
    {

        try
        {
            int construct_hour = 0;
            String meridiem = "";

            String text_hour = JOptionPane.showInputDialog("\nInput Hour: ");
            int hour = Integer.parseInt(text_hour);
            String semi_colon = JOptionPane.showInputDialog("\nInput Colon ");
            String text_minute = JOptionPane.showInputDialog("\nInput Minute:");
            int minute = Integer.parseInt(text_minute);

            if((hour > 24 || hour < 0) || (minute > 60 || minute < 0) || (!":".equals(semi_colon)))
            {
                JOptionPane.showMessageDialog(null, "Error: invalid characters");
            }
            else
            {
                switch(hour)
                {
                    case 0:
                    case 24:
                        construct_hour = 0;
                        meridiem = " AM";
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        construct_hour = hour;
                        meridiem = " AM";
                        break;
                    case 12:
                        construct_hour = 12;
                        meridiem = " PM";
                        break;
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        construct_hour = hour % 12;
                        meridiem = " PM";
                        break;
                }

                String format_minute;

                if(minute < 10)
                {
                    format_minute = "0" + Integer.toString(minute); 
                }
                else
                {
                    format_minute = Integer.toString(minute);
                }
                
                String format_hour;

                if(hour < 10)
                {
                    format_hour = "0" + Integer.toString(construct_hour);
                }
                else
                {
                    format_hour = Integer.toString(construct_hour);
                }
                JOptionPane.showMessageDialog(null, format_hour + semi_colon + format_minute + meridiem);
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        

    }
    
}
