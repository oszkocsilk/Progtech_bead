/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import  javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "Akna")
public class Player {public static class __CLR4_3_18u8ujvky5wtj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557666075751L,8589935092L,334,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private double Score;

    /**
     *
     * @return ID of player.
     */

    public Integer getID() {try{__CLR4_3_18u8ujvky5wtj.R.inc(318);
        __CLR4_3_18u8ujvky5wtj.R.inc(319);return ID;
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     *
     * @param ID sets ID of player.
     */

    public void setID(Integer ID) {try{__CLR4_3_18u8ujvky5wtj.R.inc(320);
        __CLR4_3_18u8ujvky5wtj.R.inc(321);this.ID = ID;
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     *
     * @return the score of the player.
     */

    public double getScore() {try{__CLR4_3_18u8ujvky5wtj.R.inc(322);
        __CLR4_3_18u8ujvky5wtj.R.inc(323);return Score;
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     *
     * @param Score the score of the player.
     */

    public void Score(double Score) {try{__CLR4_3_18u8ujvky5wtj.R.inc(324);
        __CLR4_3_18u8ujvky5wtj.R.inc(325);Score = Score;
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     *
     * @param ID  ID of the player.
     * @param Score the score of the player.
     */

    public Player(Integer ID, double Score) {try{__CLR4_3_18u8ujvky5wtj.R.inc(326);
        __CLR4_3_18u8ujvky5wtj.R.inc(327);this.ID = ID;
        __CLR4_3_18u8ujvky5wtj.R.inc(328);this.Score = Score;
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     *
     * @param Score the score of the player.
     */
    public Player( double Score) {try{__CLR4_3_18u8ujvky5wtj.R.inc(329);
        __CLR4_3_18u8ujvky5wtj.R.inc(330);this.Score = Score;
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     *
     * @return heding of the database and the datas in text
     */
    @Override
    public String toString() {try{__CLR4_3_18u8ujvky5wtj.R.inc(331);
        __CLR4_3_18u8ujvky5wtj.R.inc(332);return "Player{" +
                "ID=" + ID +
                ", Score=" + Score +
                '}';
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

    /**
     * Instantiating of Player.
     */
    public Player() {try{__CLR4_3_18u8ujvky5wtj.R.inc(333);
    }finally{__CLR4_3_18u8ujvky5wtj.R.flushNeeded();}}

}
