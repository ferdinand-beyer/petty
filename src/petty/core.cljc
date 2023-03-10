(ns petty.core)

(def adjectives
  ["admiring"
   "adorable"
   "adoring"
   "adventurous"
   "affectionate"
   "aggressive"
   "agitated"
   "agreeable"
   "alert"
   "alive"
   "amazing"
   "amused"
   "angry"
   "annoyed"
   "annoying"
   "anxious"
   "arrogant"
   "ashamed"
   "attractive"
   "average"
   "awesome"
   "awful"
   "bad"
   "beautiful"
   "better"
   "bewildered"
   "black"
   "blissful"
   "bloody"
   "blue"
   "blue-eyed"
   "blushing"
   "bold"
   "bored"
   "boring"
   "brainy"
   "brave"
   "breakable"
   "bright"
   "busy"
   "calm"
   "careful"
   "cautious"
   "charming"
   "cheerful"
   "clean"
   "clear"
   "clever"
   "cloudy"
   "clumsy"
   "colorful"
   "combative"
   "comfortable"
   "compassionate"
   "competent"
   "concerned"
   "condemned"
   "condescending"
   "confident"
   "confused"
   "cool"
   "cooperative"
   "courageous"
   "cranky"
   "crazy"
   "creepy"
   "crowded"
   "cruel"
   "curious"
   "cute"
   "dangerous"
   "dark"
   "dazzling"
   "dead"
   "defeated"
   "defiant"
   "delightful"
   "depressed"
   "determined"
   "different"
   "difficult"
   "disgusted"
   "distinct"
   "distracted"
   "disturbed"
   "dizzy"
   "doubtful"
   "drab"
   "dreamy"
   "dull"
   "eager"
   "easy"
   "ecstatic"
   "elastic"
   "elated"
   "elegant"
   "eloquent"
   "embarrassed"
   "enchanting"
   "encouraging"
   "energetic"
   "enthusiastic"
   "envious"
   "epic"
   "evil"
   "excited"
   "exciting"
   "expensive"
   "exuberant"
   "fair"
   "faithful"
   "famous"
   "fancy"
   "fantastic"
   "fervent"
   "festive"
   "fierce"
   "filthy"
   "fine"
   "flamboyant"
   "focused"
   "foolish"
   "fragile"
   "frail"
   "frantic"
   "friendly"
   "frightened"
   "frosty"
   "funny"
   "gallant"
   "gentle"
   "gifted"
   "glamorous"
   "gleaming"
   "glorious"
   "good"
   "goofy"
   "gorgeous"
   "graceful"
   "gracious"
   "great"
   "grieving"
   "grotesque"
   "grumpy"
   "handsome"
   "happy"
   "hardcore"
   "healthy"
   "helpful"
   "helpless"
   "heuristic"
   "hilarious"
   "homeless"
   "homely"
   "hopeful"
   "horrible"
   "hungry"
   "hurt"
   "ill"
   "important"
   "impossible"
   "inexpensive"
   "infallible"
   "innocent"
   "inquisitive"
   "inspiring"
   "intelligent"
   "interesting"
   "itchy"
   "jealous"
   "jittery"
   "jolly"
   "jovial"
   "joyous"
   "keen"
   "kind"
   "laughing"
   "lazy"
   "light"
   "lively"
   "lonely"
   "long"
   "lovely"
   "loving"
   "lucid"
   "lucky"
   "magical"
   "magnificent"
   "misty"
   "modern"
   "modest"
   "motionless"
   "muddy"
   "mushy"
   "musing"
   "mysterious"
   "mystifying"
   "nasty"
   "naughty"
   "nervous"
   "nice"
   "nifty"
   "nostalgic"
   "nutty"
   "obedient"
   "objective"
   "obnoxious"
   "odd"
   "old-fashioned"
   "open"
   "optimistic"
   "outrageous"
   "outstanding"
   "panicky"
   "peaceful"
   "pedantic"
   "pensive"
   "perfect"
   "plain"
   "pleasant"
   "poised"
   "poor"
   "powerful"
   "practical"
   "precious"
   "priceless"
   "prickly"
   "proud"
   "putrid"
   "puzzled"
   "quaint"
   "quirky"
   "quizzical"
   "real"
   "recursing"
   "relaxed"
   "relieved"
   "repulsive"
   "reverent"
   "rich"
   "romantic"
   "sad"
   "scary"
   "selfish"
   "serene"
   "sharp"
   "shiny"
   "shy"
   "silly"
   "sleepy"
   "smiling"
   "smoggy"
   "sore"
   "sparkling"
   "splendid"
   "spotless"
   "stoic"
   "stormy"
   "strange"
   "stupefied"
   "stupid"
   "successful"
   "super"
   "suspicious"
   "sweet"
   "talented"
   "tame"
   "tasty"
   "tender"
   "tense"
   "terrible"
   "thankful"
   "thirsty"
   "thoughtful"
   "thoughtless"
   "tired"
   "tough"
   "troubled"
   "trusting"
   "ugliest"
   "ugly"
   "uninterested"
   "unruffled"
   "unsightly"
   "unusual"
   "upbeat"
   "upset"
   "uptight"
   "vast"
   "vibrant"
   "victorious"
   "vigilant"
   "vigorous"
   "vivacious"
   "wandering"
   "weary"
   "wicked"
   "wide-eyed"
   "wild"
   "witty"
   "wizardly"
   "wonderful"
   "worried"
   "worrisome"
   "wrong"
   "xenodochial"
   "youthful"
   "zany"
   "zealous"
   "zen"])

(def animals
  ["aardvark"
   "albatross"
   "alligator"
   "alpaca"
   "ant"
   "anteater"
   "antelope"
   "ape"
   "armadillo"
   "baboon"
   "badger"
   "barracuda"
   "bat"
   "bear"
   "beaver"
   "bee"
   "beetle"
   "binturong"
   "boar"
   "bobcat"
   "budgerigar"
   "buffalo"
   "butterfly"
   "camel"
   "capybara"
   "cat"
   "chamois"
   "cheetah"
   "chicken"
   "chimpanzee"
   "chinchilla"
   "chough"
   "coati"
   "cobra"
   "cockroach"
   "cod"
   "cormorant"
   "cow"
   "crab"
   "crane"
   "cricket"
   "crocodile"
   "crow"
   "curlew"
   "deer"
   "dog"
   "dolphin"
   "donkey"
   "dove"
   "dragonfly"
   "duck"
   "dugong"
   "dunlin"
   "eagle"
   "echidna"
   "eel"
   "elephant"
   "elephant-seal"
   "elk"
   "emu"
   "falcon"
   "ferret"
   "finch"
   "fish"
   "flamingo"
   "fly"
   "fox"
   "frog"
   "gazelle"
   "gecko"
   "gerbil"
   "giraffe"
   "gnat"
   "gnu"
   "goat"
   "goldfinch"
   "goosander"
   "goose"
   "gorilla"
   "goshawk"
   "grasshopper"
   "grouse"
   "guanaco"
   "guinea-fowl"
   "guinea-pig"
   "gull"
   "hamster"
   "hare"
   "hawk"
   "hedgehog"
   "hermit-crab"
   "heron"
   "herring"
   "hippopotamus"
   "hornet"
   "horse"
   "hummingbird"
   "hyena"
   "ibex"
   "ibis"
   "iguana"
   "impala"
   "jaguar"
   "jay"
   "jellyfish"
   "kangaroo"
   "kingbird"
   "kinkajou"
   "kite"
   "koala"
   "komodo-dragon"
   "ladybug"
   "lapwing"
   "lark"
   "lemur"
   "leopard"
   "lion"
   "lizard"
   "llama"
   "lobster"
   "locust"
   "loris"
   "louse"
   "lyrebird"
   "mallard"
   "mammoth"
   "manatee"
   "mandrill"
   "manta-ray"
   "mantis"
   "meerkat"
   "mink"
   "mole"
   "mongoose"
   "monkey"
   "moose"
   "mosquito"
   "mouse"
   "narwhal"
   "newt"
   "nightingale"
   "octopus"
   "okapi"
   "opossum"
   "ostrich"
   "otter"
   "owl"
   "ox"
   "oyster"
   "panda"
   "panther"
   "parrot"
   "partridge"
   "peafowl"
   "pelican"
   "penguin"
   "pheasant"
   "pig"
   "pigeon"
   "polar-bear"
   "pony"
   "porcupine"
   "porpoise"
   "prairie-dog"
   "pug"
   "quail"
   "rabbit"
   "raccoon"
   "ram"
   "rat"
   "raven"
   "rhinoceros"
   "rook"
   "salamander"
   "salmon"
   "sand-dollar"
   "sandpiper"
   "sardine"
   "sea-lion"
   "sea-otter"
   "seahorse"
   "seal"
   "shark"
   "sheep"
   "shrew"
   "skink"
   "skipper"
   "skunk"
   "sloth"
   "snail"
   "snake"
   "spider"
   "spoonbill"
   "squid"
   "squirrel"
   "starfish"
   "starling"
   "stilt"
   "stingray"
   "swan"
   "tapir"
   "tarsier"
   "termite"
   "thrush"
   "tiger"
   "toad"
   "toucan"
   "turkey"
   "turtle"
   "viper"
   "wallaby"
   "walrus"
   "wasp"
   "weasel"
   "whale"
   "wildebeest"
   "wolf"
   "wolverine"
   "wombat"
   "zebra"])

(def animal-emojis
  {:ant "????"
   :badger "????"
   :bat "????"
   :bear "????"
   :beaver "????"
   :beetle "????"
   :bison "????"
   :black-cat "??????????"
   :blowfish "????"
   :boar "????"
   :butterfly "????"
   :camel "????"
   :cat "????"
   :chicken "????"
   :chipmunk "???????"
   :cockroach "????"
   :coral "????"
   :cow "????"
   :crab "????"
   :cricket "????"
   :crocodile "????"
   :deer "????"
   :dodo "????"
   :dog "????"
   :dolphin "????"
   :dove "???????"
   :dragon "????"
   :dromedary "????"
   :duck "????"
   :eagle "????"
   :elephant "????"
   :ewe "????"
   :fish "????"
   :flamingo "????"
   :fly "????"
   :fox "????"
   :frog "????"
   :giraffe "????"
   :goat "????"
   :gorilla "????"
   :hamster "????"
   :hedgehog "????"
   :hippopotamus "????"
   :honeybee "????"
   :horse "????"
   :kangaroo "????"
   :koala "????"
   :lady-beetle "????"
   :leopard "????"
   :lion "????"
   :lizard "????"
   :llama "????"
   :lobster "????"
   :mammoth "????"
   :microbe "????"
   :monkey "????"
   :mosquito "????"
   :mouse "????"
   :octopus "????"
   :orangutan "????"
   :otter "????"
   :owl "????"
   :ox "????"
   :panda "????"
   :parrot "????"
   :peacock "????"
   :penguin "????"
   :pig "????"
   :polar-bear "?????????????"
   :poodle "????"
   :rabbit "????"
   :raccoon "????"
   :ram "????"
   :rat "????"
   :rhinoceros "????"
   :rooster "????"
   :sauropod "????"
   :scorpion "????"
   :seal "????"
   :shark "????"
   :sheep "????"
   :shrimp "????"
   :skunk "????"
   :sloth "????"
   :snail "????"
   :snake "????"
   :spider "???????"
   :squid "????"
   :swan "????"
   :t-rex "????"
   :tiger "????"
   :turkey "????"
   :turtle "????"
   :unicorn "????"
   :water-buffalo "????"
   :whale "????"
   :wolf "????"
   :worm "????"
   :zebra "????"})

(defn slug
  [& {:keys [nouns separator]
      :or   {nouns animals
             separator "-"}}]
  (str (rand-nth adjectives) separator (rand-nth nouns)))

(defn alliteration
  [& {:keys [nouns separator]
      :or   {nouns animals
             separator "-"}}]
  (let [noun      (rand-nth nouns)
        adjective (rand-nth (filterv #(= (first %) (first noun)) adjectives))]
    (str adjective separator noun)))

(defn emoji
  [& {:keys [separator]
      :or   {separator "-"}}]
  (let [[animal emoji] (rand-nth (seq animal-emojis))]
    [emoji (str (rand-nth adjectives) separator (name animal))]))
