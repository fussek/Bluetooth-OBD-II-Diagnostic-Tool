package com.example.bluetoothterminal.Mod_9.PIDsFormulas;

public class IN_USE_PERFORMANCE_TRACKING_GASOLINE {
    private static final String OBDCOND = "OBD Monitoring Conditions Encountered Counts : ";
    private static final String IGNCNTR = "Ignition Counter : ";
    private static final String CATCOMP1 = "Catalyst Monitor Completion Counts Bank 1 : ";
    private static final String CATCOND1 = "Catalyst Monitor Conditions Encountered Counts Bank 1 : ";
    private static final String CATCOMP2 = "Catalyst Monitor Completion Counts Bank 2 : ";
    private static final String CATCOND2 = "Catalyst Monitor Conditions Encountered Counts Bank 2 : ";
    private static final String O2SCOMP1 = "O2 Sensor Monitor Completion Counts Bank 1 : ";
    private static final String O2SCOND1 = "O2 Sensor Monitor Conditions Encountered Counts Bank 1   ";
    private static final String O2SCOMP2 = "O2 Sensor Monitor Completion Counts Bank 2 : ";
    private static final String O2SCOND2 = "O2 Sensor Monitor Conditions Encountered Counts Bank 2 : ";
    private static final String EGRCOMP = "EGR Monitor Completion Condition Counts : ";
    private static final String EGRCOND = "EGR Monitor Conditions Encountered Counts : ";
    private static final String AIRCOMP = "AIR Monitor Completion Condition Counts (Secondary Air) : ";
    private static final String AIRCOND = "AIR Monitor Conditions Encountered Counts (Secondary Air) : ";
    private static final String EVAPCOMP = "EVAP Monitor Completion Condition Counts : ";
    private static final String EVAPCOND = "EVAP Monitor Conditions Encountered Counts : ";
    private static final String SO2SCOMP1 = "Secondary O2 Sensor Monitor Completion Counts Bank 1 : ";
    private static final String SO2SCOND1 = "Secondary O2 Sensor Monitor Conditions Encountered Counts Bank 1 : ";
    private static final String SO2SCOMP2 = "Secondary O2 Sensor Monitor Completion Counts Bank 2 : ";
    private static final String SO2SCOND2 = "Secondary O2 Sensor Monitor Conditions Encountered Counts Bank 2 : ";

    public static String read(String hexLine) {
        String response = "Invalid IPT response. \n";
        int numberOfDataItems = Integer.parseInt(hexLine.substring(0,2),16);

        if (numberOfDataItems==20){
            int obdcond = Integer.parseInt(hexLine.substring(2,6),16);
            int igncntr = Integer.parseInt(hexLine.substring(6,10),16);
            int catcomp1 = Integer.parseInt(hexLine.substring(10,14),16);
            int catcond1 = Integer.parseInt(hexLine.substring(14,18),16);
            int catcomp2 = Integer.parseInt(hexLine.substring(18,22),16);
            int catcond2 = Integer.parseInt(hexLine.substring(22,26),16);
            int o2scomp1 = Integer.parseInt(hexLine.substring(26,30),16);
            int o2scond1 = Integer.parseInt(hexLine.substring(30,34),16);
            int o2scomp2 = Integer.parseInt(hexLine.substring(34,38),16);
            int o2scond2 = Integer.parseInt(hexLine.substring(38,42),16);
            int egrcomp = Integer.parseInt(hexLine.substring(42,46),16);
            int egrcond = Integer.parseInt(hexLine.substring(46,50),16);
            int aircomp = Integer.parseInt(hexLine.substring(50,54),16);
            int aircond = Integer.parseInt(hexLine.substring(54,58),16);
            int evapcomp = Integer.parseInt(hexLine.substring(58,62),16);
            int evapcond = Integer.parseInt(hexLine.substring(62,66),16);
            int so2scomp1 = Integer.parseInt(hexLine.substring(66,70),16);
            int so2scond1 = Integer.parseInt(hexLine.substring(70,74),16);
            int so2scomp2 = Integer.parseInt(hexLine.substring(74,78),16);
            int so2scond2 = Integer.parseInt(hexLine.substring(78,82),16);

            response = "Information about in-use performance tracking.\n Number of tracked systems = " + numberOfDataItems + "\n\n"
                    +  OBDCOND   + 	obdcond    +"\n"
                    +  IGNCNTR   + 	igncntr    +"\n"
                    +  CATCOMP1  + 	catcomp1   +"\n"
                    +  CATCOND1  + 	catcond1   +"\n"
                    +  CATCOMP2  +	catcomp2   +"\n"
                    +  CATCOND2  +	catcond2   +"\n"
                    +  O2SCOMP1  + 	o2scomp1   +"\n"
                    +  O2SCOND1  +	o2scond1   +"\n"
                    +  O2SCOMP2  +	o2scomp2   +"\n"
                    +  O2SCOND2  +	o2scond2   +"\n"
                    +  EGRCOMP   + 	egrcomp    +"\n"
                    +  EGRCOND   + 	egrcond    +"\n"
                    +  AIRCOMP   + 	aircomp    +"\n"
                    +  AIRCOND   +	aircond    +"\n"
                    +  EVAPCOMP  + 	evapcomp   +"\n"
                    +  EVAPCOND  +	evapcond   +"\n"
                    +  SO2SCOMP1 + so2scomp1  +"\n"
                    +  SO2SCOND1 + so2scond1  +"\n"
                    +  SO2SCOMP2 + so2scomp2  +"\n"
                    +  SO2SCOND2 + so2scond2  +"\n";
        }
        return response;
    }


}
