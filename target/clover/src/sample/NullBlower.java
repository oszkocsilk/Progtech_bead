/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import java.util.ArrayList;

/**
 * Blows those buttons which has 0 value and the neighbours of the clicked button.
 */

public class NullBlower implements mezo{public static class __CLR4_3_15i5ijvky5wt2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557666075751L,8589935092L,318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Akna akna= new Akna();
    private  int disabledCounter=0;

    /**
     *Blows the 0 value neighbours.
     * @param toClear the ist of buttons which have to disabled.
     */
    public void Blower(ArrayList<Integer> toClear){try{__CLR4_3_15i5ijvky5wt2.R.inc(198);

        __CLR4_3_15i5ijvky5wt2.R.inc(199);if((((toClear.size()==0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(200)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(201)==0&false)))
        {{
            __CLR4_3_15i5ijvky5wt2.R.inc(202);return;
        }
        }else
        {{
            __CLR4_3_15i5ijvky5wt2.R.inc(203);int i=toClear.get(0)/100;
            __CLR4_3_15i5ijvky5wt2.R.inc(204);int j=toClear.get(0)%100;
            __CLR4_3_15i5ijvky5wt2.R.inc(205);toClear.remove(0);
            __CLR4_3_15i5ijvky5wt2.R.inc(206);if((((counter[i][j]==0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(207)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(208)==0&false)))
            {{
                __CLR4_3_15i5ijvky5wt2.R.inc(209);if((((i>0 && j>0 && !mezo[i-1][j-1].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(210)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(211)==0&false))) {{                                                         //bal fels\u0151
                    __CLR4_3_15i5ijvky5wt2.R.inc(212);mezo[i - 1][j - 1].setText(counter[i - 1][j - 1] + "");
                    __CLR4_3_15i5ijvky5wt2.R.inc(213);if ((((counter[i - 1][j - 1] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(214)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(215)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(216);toClear.add((i - 1) * 100 + (j - 1));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(217);if ((((mezo[i - 1][j - 1].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(218)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(219)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(220);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(221);mezo[i - 1][j - 1].setDisable(true);
                    }

                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(222);if((((j>0 && !mezo[i][j-1].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(223)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(224)==0&false))) {{                                                                  //fels\u0151
                    __CLR4_3_15i5ijvky5wt2.R.inc(225);mezo[i][j - 1].setText(counter[i][j - 1] + "");
                    __CLR4_3_15i5ijvky5wt2.R.inc(226);if ((((counter[i][j - 1] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(227)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(228)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(229);toClear.add((i) * 100 + (j - 1));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(230);if ((((mezo[i][j - 1].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(231)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(232)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(233);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(234);mezo[i][j - 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(235);if((((i>0 && !mezo[i-1][j].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(236)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(237)==0&false))) {{                                                                  //bal
                    __CLR4_3_15i5ijvky5wt2.R.inc(238);mezo[i - 1][j].setText(counter[i - 1][j] + "");
                    __CLR4_3_15i5ijvky5wt2.R.inc(239);if ((((counter[i - 1][j] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(240)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(241)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(242);toClear.add((i - 1) * 100 + (j));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(243);if ((((mezo[i - 1][j].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(244)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(245)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(246);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(247);mezo[i - 1][j].setDisable(true);
                    }
                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(248);if((((j<counter.length-1 && !mezo[i][j+1].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(249)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(250)==0&false))) {{                                                   //als\u00f3
                    __CLR4_3_15i5ijvky5wt2.R.inc(251);mezo[i][j + 1].setText(counter[i][j + 1] + "");
                    __CLR4_3_15i5ijvky5wt2.R.inc(252);if ((((counter[i][j + 1] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(253)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(254)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(255);toClear.add((i) * 100 + (j + 1));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(256);if ((((mezo[i][j + 1].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(257)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(258)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(259);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(260);mezo[i][j + 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(261);if((((i<counter[0].length-1 && !mezo[i+1][j].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(262)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(263)==0&false))){{                                                //jobb
                    __CLR4_3_15i5ijvky5wt2.R.inc(264);mezo[i+1][j].setText(counter[i+1][j]+"");

                    __CLR4_3_15i5ijvky5wt2.R.inc(265);if((((counter[i+1][j]==0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(266)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(267)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(268);toClear.add((i + 1) * 100 + (j));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(269);if((((mezo[i+1][j].isDisable()==false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(270)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(271)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(272);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(273);mezo[i + 1][j].setDisable(true);
                    }
                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(274);if((((i<counter[0].length-1 && j>0 && !mezo[i+1][j-1].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(275)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(276)==0&false))) {{                                       //jobb fels\u0151
                    __CLR4_3_15i5ijvky5wt2.R.inc(277);mezo[i + 1][j - 1].setText(counter[i + 1][j - 1] + "");

                    __CLR4_3_15i5ijvky5wt2.R.inc(278);if ((((counter[i + 1][j - 1] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(279)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(280)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(281);toClear.add((i + 1) * 100 + (j - 1));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(282);if ((((mezo[i + 1][j - 1].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(283)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(284)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(285);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(286);mezo[i + 1][j - 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(287);if((((i>0 && j<counter.length-1 && !mezo[i-1][j+1].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(288)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(289)==0&false))) {{                                          //bal als\u00f3
                    __CLR4_3_15i5ijvky5wt2.R.inc(290);mezo[i - 1][j + 1].setText(counter[i - 1][j + 1] + "");

                    __CLR4_3_15i5ijvky5wt2.R.inc(291);if ((((counter[i - 1][j + 1] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(292)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(293)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(294);toClear.add((i - 1) * 100 + (j + 1));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(295);if ((((mezo[i - 1][j + 1].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(296)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(297)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(298);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(299);mezo[i - 1][j + 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15i5ijvky5wt2.R.inc(300);if((((i<counter[0].length-1 && j<counter.length-1 && !mezo[i+1][j+1].isDisabled())&&(__CLR4_3_15i5ijvky5wt2.R.iget(301)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(302)==0&false))) {{                        //jobb als\u00f3
                    __CLR4_3_15i5ijvky5wt2.R.inc(303);mezo[i + 1][j + 1].setText(counter[i + 1][j + 1] + "");

                    __CLR4_3_15i5ijvky5wt2.R.inc(304);if ((((counter[i + 1][j + 1] == 0)&&(__CLR4_3_15i5ijvky5wt2.R.iget(305)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(306)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(307);toClear.add((i + 1) * 100 + (j + 1));
                    }
                    }__CLR4_3_15i5ijvky5wt2.R.inc(308);if ((((mezo[i + 1][j + 1].isDisable() == false)&&(__CLR4_3_15i5ijvky5wt2.R.iget(309)!=0|true))||(__CLR4_3_15i5ijvky5wt2.R.iget(310)==0&false))) {{
                        __CLR4_3_15i5ijvky5wt2.R.inc(311);disabledCounter++;
                        __CLR4_3_15i5ijvky5wt2.R.inc(312);mezo[i + 1][j + 1].setDisable(true);
                    }
                }}
            }}
            }__CLR4_3_15i5ijvky5wt2.R.inc(313);Blower(toClear);
        }
    }}finally{__CLR4_3_15i5ijvky5wt2.R.flushNeeded();}}

    /**
     *
     * @return number of disabled buttons.
     */

    public int getDisabledCounter() {try{__CLR4_3_15i5ijvky5wt2.R.inc(314);
        __CLR4_3_15i5ijvky5wt2.R.inc(315);return disabledCounter;
    }finally{__CLR4_3_15i5ijvky5wt2.R.flushNeeded();}}

    /**
     *
     * @param disabledCounter modify of the number of disabled buttons.
     */
    public void setDisabledCounter(int disabledCounter) {try{__CLR4_3_15i5ijvky5wt2.R.inc(316);
        __CLR4_3_15i5ijvky5wt2.R.inc(317);this.disabledCounter = disabledCounter;
    }finally{__CLR4_3_15i5ijvky5wt2.R.flushNeeded();}}
}
