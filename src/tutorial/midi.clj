(ns tutorial.midi
  (:import (javax.sound.midi MidiSystem Synthesizer)))

(defn play-raw-note [channel note velocity]
  (.noteOn channel note velocity))

(defn play-a-note [note velocity duration]
  (with-open [synth (doto (MidiSystem/getSynthesizer) .open)]
    (let [channel (aget (.getChannels synth) 0)]
      (play-raw-note channel note velocity)
      (Thread/sleep duration))))

(play-a-note 60 127 3000)