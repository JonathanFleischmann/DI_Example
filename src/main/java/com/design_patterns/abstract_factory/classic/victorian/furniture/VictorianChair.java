package com.design_patterns.abstract_factory.classic.victorian.furniture;

import com.design_patterns.abstract_factory.classic.interfaces.furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public void printChairPicture() {
        System.out.println("                       ..+*-.                                                     \n" +
                "                    .-+%%%%%%*..                                                  \n" +
                "                  .+%%%%%%%%%%%%#=.                                               \n" +
                "                .+%%%##***####%#%%%*:.                                            \n" +
                "               :%%%*====+=====+**=+*#%*..                                         \n" +
                "              .#%%#+++==+===+=+====++*#%+                                         \n" +
                "               *%%#+++=====+===--==++++#%-                                        \n" +
                "               :%#%+====+=-===*+--+=++++*%.                                       \n" +
                "               .*#%#=++==+*===+*=+--=-==#%                                        \n" +
                "               ..##%*++==**-=+****+==-=+**                                        \n" +
                "                 -%#%+=-====+**=++**===##-                                        \n" +
                "                  +%%#++---==+++++**+==##-.                                       \n" +
                "                 ..%*%#::===#=+++#+==-=*#-.                                       \n" +
                "                   +#%#---=-=***++*+====#+.                                       \n" +
                "                   =%##=-=+==+-==*-=+++##*:..  ...        ..                      \n" +
                "                   -%##+-=-=-==-=-=*=-=+**##%%#+=-:.......::::..                  \n" +
                "                   -#%%%*++++===++--==*%++...:=#%%%%%%%%%%%%%%%%*.                \n" +
                "                   .+%%%%#%%#%%###*+=+#+#-              .:*%%%%%#:.               \n" +
                "                    .-###%@%%%%%%%%#+*###.               .%%#......               \n" +
                "                     .*#%%%%##%%%####%#=*.             . *%%:                     \n" +
                "                      +%#%%%%%####%#:.+%#-              .*%#:                     \n" +
                "                     .+%*%...+##*....:=***:-----------::.*##:                     \n" +
                "                     .+#*#...*###**+*#***#******=++=++=+*****=.   .               \n" +
                "                     .+##%+++*#******++++*=+++=+++**+*+=++=+*+*#=..               \n" +
                "                     .+##+++=+#**%++=+==+***==++==+++*#*+==*#+*+%-                \n" +
                "                      +##*++++#***==***++*+=++=++*+=+####**#%%@%%=                \n" +
                "                      =%%%%#**#%*#*=+***+===**==##**%*%%%%%#%%@%#%:               \n" +
                "                      =#%%%######%@##++++=*##%#####%%%%#%%%**%%##%*:              \n" +
                "                      -##@#:#####%@%%%###%%%%%%%#%#%-@%%@%#..:%%##%-              \n" +
                "                      :##%#   .=++*#%%#%+%%%%%#==+##%#*+-:   :#%##*:.             \n" +
                "                      :##%+  .   ...:#####%%*-.          .   :#%##:               \n" +
                "                   ...:*#%-..........%#%+%%#:                :%##-.               \n" +
                "                  ....-*#%........:::####%%#:...             *%%+.                \n" +
                "               .......-##%.....::::::=###%%+:.......        .%%%.                 \n" +
                "               .......+##*:::::::::::-###%#+:................%%%.                 \n" +
                "               ......:+#%=::::::::::::=*###=.................##%+.....            \n" +
                "                 ...::*##-::::........=####:.........::::::.::##%%%-:.            \n" +
                "                   ..:#%=:............:*#%%..........::::::::::%%%*:..            \n" +
                "                      .................%##%..........::::.......:..               \n" +
                "                           ............%#%%:....:::::...........                  \n" +
                "                             ..........##*%=.::::::.......                        \n" +
                "                                 .....:#%%%*::::::....                            \n" +
                "                                   ...:###%*--::....                              \n" +
                "                                     ..*#%#=::...                                 \n" +
                "                                      ..:-....                                    ");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on VictorianChair");
    }
}
