/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

/**
 * This watches the mouse click, runs the timer, count disabled buttons, watches if you win or lost.
 */
public class Controller implements mezo {public static class __CLR4_3_13030jvky5wqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557666075751L,8589935092L,190,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@code}timer counts the time.
     * {@code}score counts the score.
     * {@code}lose watches if you lose.
     * {@code}win watches if you win.
     * {@code}disables counts the disabled buttons.
     */
    public double timer=0.0;
    private Double score=0.0;
    private boolean lose=false;
    int disabled=0;
    private boolean win;


    private Akna akna=new Akna();
    private Aknakereso aknakereso;
    private BlowedUp b;
    private static EntityManager em;

    ArrayList<Integer> toClear = new ArrayList<Integer>();
    NullBlower nullBlower = new NullBlower();


    EventHandler<MouseEvent> eventHandler = new EventHandler<>() {
        /**
         *Watches the mouse click, if it is on a button.
         * @param event Event of the mouse click
         */
        @Override
        public void handle(MouseEvent event) {try{__CLR4_3_13030jvky5wqj.R.inc(108);
            __CLR4_3_13030jvky5wqj.R.inc(109);for (int i = 0; (((i < aknakereso.getMezo().length)&&(__CLR4_3_13030jvky5wqj.R.iget(110)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(111)==0&false)); i++) {{
                __CLR4_3_13030jvky5wqj.R.inc(112);for (int j = 0; (((j < aknakereso.getMezo().length)&&(__CLR4_3_13030jvky5wqj.R.iget(113)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(114)==0&false)); j++) {{
                    __CLR4_3_13030jvky5wqj.R.inc(115);if ((((event.getSource().equals(aknakereso.getMezo()[i][j]))&&(__CLR4_3_13030jvky5wqj.R.iget(116)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(117)==0&false))) {{
                            __CLR4_3_13030jvky5wqj.R.inc(118);disabled++;
                        __CLR4_3_13030jvky5wqj.R.inc(119);if ((((counter[i][j] != 666)&&(__CLR4_3_13030jvky5wqj.R.iget(120)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(121)==0&false))) {{

                            __CLR4_3_13030jvky5wqj.R.inc(122);if ((((counter[i][j] == 0)&&(__CLR4_3_13030jvky5wqj.R.iget(123)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(124)==0&false))) {{

                                __CLR4_3_13030jvky5wqj.R.inc(125);aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                __CLR4_3_13030jvky5wqj.R.inc(126);aknakereso.getMezo()[i][j].setDisable(true);

                                __CLR4_3_13030jvky5wqj.R.inc(127);toClear.add(i * 100 + j);
                                __CLR4_3_13030jvky5wqj.R.inc(128);nullBlower.Blower(toClear);

                            } }else {{
                                __CLR4_3_13030jvky5wqj.R.inc(129);aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                __CLR4_3_13030jvky5wqj.R.inc(130);aknakereso.getMezo()[i][j].setDisable(true);
                            }
                            }__CLR4_3_13030jvky5wqj.R.inc(131);disabled+=nullBlower.getDisabledCounter();
                            __CLR4_3_13030jvky5wqj.R.inc(132);win();
                            __CLR4_3_13030jvky5wqj.R.inc(133);nullBlower.setDisabledCounter(0);
                        } }else {{
                             __CLR4_3_13030jvky5wqj.R.inc(134);b.Blowed();

                            __CLR4_3_13030jvky5wqj.R.inc(135);b.display("LOSER","YOU LOST!");
                            __CLR4_3_13030jvky5wqj.R.inc(136);lose=true;

                            }
                        }}
                    }}
                }}
            }}finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}
        };


    /**
     *Tests if you win or not.
     */

    public void win() {try{__CLR4_3_13030jvky5wqj.R.inc(137);
        __CLR4_3_13030jvky5wqj.R.inc(138);for (int i = 0; (((i < Aknakereso.counter[0].length)&&(__CLR4_3_13030jvky5wqj.R.iget(139)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(140)==0&false)); i++) {{
            __CLR4_3_13030jvky5wqj.R.inc(141);for (int j = 0; (((j < Aknakereso.counter.length)&&(__CLR4_3_13030jvky5wqj.R.iget(142)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(143)==0&false)); j++) {{
                __CLR4_3_13030jvky5wqj.R.inc(144);if ((((Aknakereso.counter[i][j] == BOMB && Aknakereso.mezo[i][j].isDisabled() == false)&&(__CLR4_3_13030jvky5wqj.R.iget(145)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(146)==0&false))) {{
                    __CLR4_3_13030jvky5wqj.R.inc(147);win = false;
                }
                }else {__CLR4_3_13030jvky5wqj.R.inc(148);if((((disabled==(all-akna.getNumberOfBombs()) )&&(__CLR4_3_13030jvky5wqj.R.iget(149)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(150)==0&false))){{
                    __CLR4_3_13030jvky5wqj.R.inc(151);win=true;
                }
            }}}
        }}
    }}finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}

    /**
     *Starts the timer and tries to catch mouse event.
     * @param aknakereso calls the created aknakereso.
     */
    public Controller(Aknakereso aknakereso) {try{__CLR4_3_13030jvky5wqj.R.inc(152);
        __CLR4_3_13030jvky5wqj.R.inc(153);this.aknakereso = aknakereso;
        __CLR4_3_13030jvky5wqj.R.inc(154);this.b = new BlowedUp(aknakereso);

        __CLR4_3_13030jvky5wqj.R.inc(155);new AnimationTimer(){
            @Override
            public void handle(long l) {try{__CLR4_3_13030jvky5wqj.R.inc(156);

                    __CLR4_3_13030jvky5wqj.R.inc(157);timer++;
                  //  System.out.println(timer / 60);

                __CLR4_3_13030jvky5wqj.R.inc(158);if ((((win==true)&&(__CLR4_3_13030jvky5wqj.R.iget(159)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(160)==0&false))) {{

                    __CLR4_3_13030jvky5wqj.R.inc(161);score = ( akna.getNumberOfBombs() * 1000 )   /   ( timer / 60 );

                    __CLR4_3_13030jvky5wqj.R.inc(162);System.out.println("score \u00e9rt\u00e9ke:"+getScore());
                    __CLR4_3_13030jvky5wqj.R.inc(163);b.display("WIN", "YOU WIN!\nYour score is: "+score);
                    __CLR4_3_13030jvky5wqj.R.inc(164);data(score);
                    __CLR4_3_13030jvky5wqj.R.inc(165);this.stop();

                }
                }__CLR4_3_13030jvky5wqj.R.inc(166);if ((((lose==true)&&(__CLR4_3_13030jvky5wqj.R.iget(167)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(168)==0&false))) {{

                    __CLR4_3_13030jvky5wqj.R.inc(169);this.stop();

                }
            }}finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}
        }.start();

        __CLR4_3_13030jvky5wqj.R.inc(170);for (int i = 0; (((i < aknakereso.getMezo().length)&&(__CLR4_3_13030jvky5wqj.R.iget(171)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(172)==0&false)); i++) {{
            __CLR4_3_13030jvky5wqj.R.inc(173);for (int j = 0; (((j < aknakereso.getMezo().length)&&(__CLR4_3_13030jvky5wqj.R.iget(174)!=0|true))||(__CLR4_3_13030jvky5wqj.R.iget(175)==0&false)); j++) {{
                __CLR4_3_13030jvky5wqj.R.inc(176);aknakereso.getMezo()[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);
            }
        }}
    }}finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}

    /**
     *Make contact with the database, than pushes up te new data.
     * @param Score the score of the current player for uploading.
     */
    private void data(double Score){try{__CLR4_3_13030jvky5wqj.R.inc(177);


            __CLR4_3_13030jvky5wqj.R.inc(178);EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
            __CLR4_3_13030jvky5wqj.R.inc(179);em = emf.createEntityManager();
            __CLR4_3_13030jvky5wqj.R.inc(180);createPlayer(Score);
            __CLR4_3_13030jvky5wqj.R.inc(181);em.close();
            __CLR4_3_13030jvky5wqj.R.inc(182);emf.close();
        }finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}

    /**
     *Makes a new player, whith an ID and pushes up to the database.
     * @param Score the score of the current player.
     */
    private static void createPlayer(double Score) {try{__CLR4_3_13030jvky5wqj.R.inc(183);
        __CLR4_3_13030jvky5wqj.R.inc(184);em.getTransaction().begin();
        __CLR4_3_13030jvky5wqj.R.inc(185);Player emp = new Player(Score);
        __CLR4_3_13030jvky5wqj.R.inc(186);em.persist(emp);
        __CLR4_3_13030jvky5wqj.R.inc(187);em.getTransaction().commit();
    }finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}

    /**
     *
     * @return gives back the score
     */
    public double getScore() {try{__CLR4_3_13030jvky5wqj.R.inc(188);
        __CLR4_3_13030jvky5wqj.R.inc(189);return score;
    }finally{__CLR4_3_13030jvky5wqj.R.flushNeeded();}}

}