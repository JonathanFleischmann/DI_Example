package com.design_patterns.abstract_factory.classic.victorian.furniture;

import com.design_patterns.abstract_factory.classic.interfaces.furniture.CoffeeTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VictorianCoffeeTable implements CoffeeTable {
    private static final Logger logger = LoggerFactory.getLogger(VictorianCoffeeTable.class);

    @Override
    public void printCoffeeTablePicture() {
        logger.info("""
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                    ..:-***++--:::.....                                          \s
                            ....:=+%%@@@@#***+++=====++=======--:....                            \s
                       ..:-=*#%@@@%#*=-======--=---=======+++++++++++*****++---:::....           \s
                   .+++++#%@@%+======================================+*###%%%###########**+==+:  \s
                  .+#%%%%%%##**++++==============================================++****#*++*##=  \s
                   .*#%#%%#######**##*#%#+====++======================================++*###@%:  \s
                    -###%######**##**+##*+=+*#*+*%#****++++=======================++++*###%%@#:  \s
                   .-######*******+****==+**#+*#%*++***+=+#%##%@#**+++++++==++==+++*####%###@*.  \s
                   :+%@%####******+*++++++++=++++++***+*#%***##****#%%##%%####***#####%####%@%=  \s
                  *#+#@-..  -#*####*+**#**+**++*++===**++***+=+###%#%%@%###%####%###%*####%@@@@% \s
                 .#*#@+            .=+*++++**++++++++*+++++=++++**+****#####%%%#%%#**#####:.@@@@.\s
                  :@%@#.              ..=#@+.***=+*#=+*+**#**+*+++%+**+*####%%%##%#*****=. :#@@. \s
                   .*%@%.               .+*    .-. .:=*+***#%####*+*+*#**####%%%###***=:  .**%-  \s
                     .%@@:                                        :#%%+..*%##%%%%%*:      =*@:   \s
                      -%@+.                                                 -#@@@@*.     .#@=    \s
                      :%##.                                                  .*@@@@=.    :%@=    \s
                    -%#%%-                                                    -%+*@+.     %@#@*  \s
                    -@@%.                                                      %#*%*       =@@-  \s
                     .+-                                                       %%@@-        -=   \s
                                                                              .@@@-              \s
                                                                              =@@=               \s
                                                                              +@#.               \s
                                                                              =%%:               \s
                                                                              --#=               \s
                                                                              .@@@-              \s
                                                                               :@%%.             \s
                                                                                *%:              \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                 \s
                                                                                                  \
                """);
    }

    @Override
    public void placeCoffee() {
        logger.info("Coffee is placed on Victorian coffee table.");
    }
}
