package main.java.music;

import main.java.music.Instrument;

/**
 * Created by zsuzsanna.padar on 2017. 05. 31..
 */
abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
}