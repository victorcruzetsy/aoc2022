package aoc2022.day6;

import java.util.HashMap;
import java.util.Map;

public class TunningTrouble {
    public static void main(String[] args) {
        String s = "mgwwjddqzqdqsstctjjsdjsdsrsfsmfsfwwltwlwhwnhhlffzddgffwlffbsfshfshhgvvdrrltlzlnzznrrnrsnnhgnnfjnnvpnnbjjnwwrcwrrhlhvlhhmzmqzqrqtqmqpmpwwmssgsrgrgtgmtgmtgtdtvdvmvsvsbvsbvbtthmmftmmdnmddcrcvcrrfjfhhfjhffjllcpllmcctjtrttwmtwmwffrlrqlqzzpddsqdqqgjqgjgngwnncjnnvsnswwbzbtzzflzzqsqbsbvbmbnnjpnpnnpfpmpmnpmmjljtltssqnsqslstswtwswwjddvmmzlzqlzqzqjjlttmtrtbtmtgmtmsttrctrrsqrqvvrzrcrhhlnhllbfbtthrhdhllmwlmlgglgsgmgsmszzprpwpfprfftffpssjzjgzjzddqfqmmwqwvwlvlqqtbtwwrwttmsmppbmmpcmctcnnhssnjncnlcnctcjjrzrwrfwfcwffczztrtsrtstlsssljssmvssjzssrqqrcqqwlqwlwffsflssrrzhzzhrzzdgdppspwplpqptttvddggzszccrrnzzwwdwjddrvvwggpvgpvvhdhqddffrnngcncjcjlcchrrftrrjccrcrqqgcglcgcscmmlzmmtcmcffwfcfrcrggdmggdvvnrvnnphnngzzpdpgpspqqgrrnffmfpmffmgfmmjmzztlljlggljjcnnrqnqpnqndnffnwwbpwpjwjjlslmsmtmtjttsvsggrmmdpmmcjjswsqqwfwwrwffczfzggqvggdlldhllsdsfdsdhhmmzmjjmpjpddsccqrrjhjlhjjcnnpwnnffjwwcsszrrnmnsmnnjbnndwnnnhnwwjtwtlwtwqqbnqnbnqqfjfdjdbbwbqwqpqggbcbhhtrtqrrddpdwdlwdddzvzwvvdfdpdcdvdtdpttwwdzdzmdmqmzmnzmnmhmwmjwwshhcqcpcvvzgzdggnjnnhwnhhswwvccqrqlqggcngnmggmffblbglltlstshhrjjlvlppsqslljtjtgglvltvlvmllhrhdrrmqrmqmjjdcjjppqwwllvsvsrszslsvvghvvhmmfbfvfpfmmvdvppwggtrrjvvsbbzffbmffpqqqhnhncclzczwcwpwssrprfrsrbsbnbvnnwzwqqpsqsspmssztssstrtcczsznzvvpvttnssdjdhjddngdgvvmsszbzsbsmbbgsbgsgmmhwhghrhjhphshchgglmlvlhlbhlldwdggdsscvcbcssfbbvggvwwtstltrrwttjdtdvttlsttfhfmhhcbclbcbffqqslshlldhdqhhjwwlffrbrdbrrgcrrfmffbhhlslrslrslrlsrsnsnvvqfqnnfdfmfmttmcmcrrcmmmjttjvtvvjbjqjnnbtbnblbtlblplgltlqltlztzvvtdvvtpvvwdwfflbflfrrhbrbbmjmcjmccztzwwjzwwzwdzdnnwcclbllqgghjhlhthwrdglrmcpbmtrnrdtvjrpmzqmljzzrtpzsrhnjrsdmpnsgdhvqchcfqjqdncjqfnscwjqvszpzzfhpjljmvsqnjzmrsgsbzlvrddtdmwbwwgprlvdfflrpztdzrhtmlzrrtdmpmcprqzzwlnmfjvsrltfjgcnnfllnzmbjcbthvbffczsspmczrpgpdjmvrvfmprfmnqdcnfwwvgdrwvrbtlqmhrrjvtrmmgrlprtnzdlszgbtbwztdrmpmlfblshzcnsczlblgwzrpnlccwhmcqhssmpznbdnnqgzzmjprjttdjhmjbmgqvzblsjwmplzsthrswhsdbvtqgrfzmbpqtpqgqdqcvzlgjrtvrhvzgmcmrwdmfpdvjddsmmsnvrdgnsbsdzcbprbqchqcgnwmfsrmqtrcdhdtzztbvmpblftwqlmlmmjcjhhjlgnnhljnncvbnjhgbjrltlwscswgvqmcnssbcdrtbgnhgmpmvjwtrbrbrdbdqfrncvhdstwztwcpbjrjwzmdlwvlvmsrhghjwjnjstbcqjqtjrgcvhzjdhdgbgdlhvjmztwvhgzzggwwhhhzvtrldchztmwfjvnqnvhnwpfvzzvnlvsccmvsngzgtnttssmdmhwzlhtpnfhczsdfnrstbwvwpqmslcvpvhfzttzhsgzpbhqdtswshljpncznjhzmgvvbcllmzprhrvwljwcjpcdqmwbzvsdcgtmwnrhswsgqhwpwhbjpnhnpjvgsqcjltzrqvqfflcdcvpwnznvtqbfbtlpmtdgbbwdwncqsqnbtgfdzzqzzvjnwmzdmlgstmnjwznjqghglvmwjzlqrnddcqhgndlhlbmqdhrqgrjqztnhpzssnwmrqclmwpgbvfrvgqqvtthznsqwgndjrprbgrhcvhpzbfhdmgnhsrqjvjstbtmnltsbjfzczvjqnhtldqclsflbhvvlzjwrqqgbgpwqwpfjctqpzdqwcfstmwbzgrgrtzngljjnvtggrqcbgjwtqsdgwmfjqppnzgfsfdmlctztbhnntnntdlvrsdvnllvmpggjzspqfhzwrttwzpqrnqjhmpjnmrzrpnqzshcqgctbtflqflcrzpmnphgbbghhwzplljwngbtffwmrwggdztvtfgwldlswqvjptvbfvnbpglhgrdgcfmvrslqldmwjqvjpvwgpjddvglllvpqwvbchqsmjrncgvgmqbsbcwfbsbpqcqzjfpcdzszgmvqgqjlflpfzbsrhsrzrdbpssrjbcfhvztftlzqpsglpwhbscgwdlbgghzsbwznnbgnnsgjghmmpmmrmqmdhnflgvgprqfcbpzbcpjscvnpfrmtvzsbflmffvcfsvdsggzdqtppcjzphcqwrqtrczqmwcdmdqndzmhdpnfqsbndnvjlzrsjzmpcrfgjwccsdtzvslccwhlvzjwjgvwpsnsggmqgsjfbwmjstsgnqmtjhljvfnflnngdrqvscwlqqdsglhghczhjdvgrjcqblmncdbjvsbwgptgpvvzhcjgjnvttrgzrjnqlvfbrmpzdcbbnnrqptpzpssznbsrstdphbgdrsnrhcjwwgsncdzvqfnmnvqcmcgdgjdbqjzdrvvbvhjdfcqndmqwscmsvppclzrhgbldqtwctbdhpbbwfvwpcpsvddmrhqbhlrrmrblnmqqqbwvcwwbwprlmhtdncmjhmjgphmrrhcdrqgmcrzwsznqzpngbtsvjgglrddhjflbrhvqwmmhmqzhphwnvqwzczdvqjsnlhfqbcgddtwgnlcgbfqmzfpqmnbpvfhdhjlnwtrlmggtbfnfvmqrzjvjjvffctsrwgfcpghhnzqmwtlsfhjrvqpwqhngrhpswslsvtgnbvbmwsfwmpntfsfpshrjzvghhpvnlbmnrhltfpmqdwzfhztvhlmbnmhnbvdzbbtczvwbvwtvjghhjjrtgbrqrhmbgvssstdwztdmdsqtctghjhsnpslqttdlvndmjfnmdzwrblfjqcwptfttvlcgsvwcbmfzbdlmrtchgqlfspwznbzfjthjtfwshqgfsfdsmzsmpptzschlzjshvfwtmpszvrvlggbrgpcnqwndhjjprztdfddblhfljbvttfvhchhdfsftrhccrbncmhwpcpwfqthngcqptmvsmpcswdrdlcbqvvhwmcqqwbzlblrgfcrrndwdvlvnpjvwchzjzmgrqhzzmgqqdsdflpclpdtlhvhcthzjfbvjvzsnbvwfsnglvbnwnbgrqwpbgclhjhztttbjwvmlmmgmzncbwswncqhmcfjfnwnpbrmchhpgwngrfwgdfdqmblwlghdjvdhjftdblrtcvvgbvpmbjhfwgpmghqbqrcpgfvhtvqtlbjdblggcpjzlrhpbsqwntfhbhwwszpdlsgbpfqhvrjrhsldcgvqhqmwdfcrcmhrvvwvbrfsrrcvwzhqqvgltlnhwhdrhrdqsvmdzjwgmqdsccwhcgwltfhdfqpsltjccwsttmrc";
//        String s = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.size() == 4) {
                System.out.println(i);
                System.exit(1);
            }
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            if (i >= 4) {
                map.put(s.charAt(i - 4), map.get(s.charAt(i - 4)) - 1);
                if (map.get(s.charAt(i - 4)) <= 0)
                    map.remove(s.charAt(i - 4));
            }

        }
    }
}