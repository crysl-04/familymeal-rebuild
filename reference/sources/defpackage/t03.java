package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.sqlite.SQLiteConnection;
import com.familymeal.app.MainActivity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class t03 {
    public static final rt0 A;
    public static final s0 a;
    public static final nx c;
    public static final nx e;
    public static final nx f;
    public static final nx g;
    public static final nx h;
    public static final nx i;
    public static final nx k;
    public static final nx l;
    public static final nx m;
    public static final nx n;
    public static final nx o;
    public static final nx p;
    public static final nx q;
    public static final nx r;
    public static final nx s;
    public static final da x;
    public static final ns b = new ns();
    public static final nx d = new nx(-1158315891, false, new tx(6));
    public static final nx j = new nx(76099183, false, new tx(3));
    public static final h42 t = new h42();
    public static final h90 u = new h90(1.0f, 1.0f);
    public static final float[] v = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] w = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final qf0 y = new qf0("NO_OWNER", (byte) 1);
    public static final rh2[] z = new rh2[0];
    public static final fd B = new fd(Float.NaN, Float.NaN);
    public static final s03 C = new s03(new jc2(21), new jc2(22));
    public static final zm2 D = new zm2(new up1(4333543705419175690L));
    public static final hx2 E = new hx2(0, new long[0], new Object[0]);
    public static final qv F = qv.o;
    public static final float G = 0.38f;
    public static final ss2 H = new ss2(16);

    static {
        byte b2 = 19;
        a = new s0(b2);
        byte b3 = 2;
        c = new nx(165006475, false, new tx(b3));
        byte b4 = 7;
        e = new nx(-178981901, false, new tx(b4));
        byte b5 = 8;
        f = new nx(-2014298775, false, new tx(b5));
        byte b6 = 9;
        g = new nx(661693607, false, new tx(b6));
        byte b7 = 10;
        h = new nx(706447938, false, new ig(b7));
        i = new nx(-2082984911, false, new tx(b7));
        k = new nx(-1652140150, false, new ig(b4));
        byte b8 = 4;
        l = new nx(-2072670816, false, new tx(b8));
        byte b9 = 5;
        m = new nx(1165565278, false, new tx(b9));
        n = new nx(1224804409, false, new ig(b5));
        o = new nx(696438808, false, new ig(b6));
        byte b10 = 18;
        p = new nx(-194303732, false, new ig(b10));
        q = new nx(300551914, false, new tx(b10));
        r = new nx(1430953580, false, new tx(b2));
        s = new nx(-1759434350, false, new yx(b8));
        x = new da(b9);
        A = new rt0(b3);
    }

    public static void C(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final rg1 D(vp0 vp0Var) {
        return new y21(vp0Var, null);
    }

    public static final rg1 E(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new y21(null, vp0Var));
    }

    public static final rg1 F(rg1 rg1Var, pt1 pt1Var) {
        return rg1Var.c(new qt1(pt1Var));
    }

    public static final rg1 G(rg1 rg1Var, float f2) {
        return rg1Var.c(new nt1(f2, f2, f2, f2));
    }

    public static rg1 H(rg1 rg1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return rg1Var.c(new nt1(f2, f3, f2, f3));
    }

    public static final rg1 I(rg1 rg1Var, float f2, float f3, float f4, float f5) {
        return rg1Var.c(new nt1(f2, f3, f4, f5));
    }

    public static rg1 J(rg1 rg1Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return I(rg1Var, f2, f3, f4, f5);
    }

    public static final Double K(String str) {
        Double dValueOf;
        str.getClass();
        String string = co2.g0(str).toString();
        string.getClass();
        String strReplace = string.replace(',', '.');
        strReplace.getClass();
        try {
            dValueOf = io2.J(strReplace) ? Double.valueOf(Double.parseDouble(strReplace)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf == null || Math.abs(dValueOf.doubleValue()) > Double.MAX_VALUE) {
            return null;
        }
        return dValueOf;
    }

    public static final String M(double d2) {
        String plainString = BigDecimal.valueOf(d2).stripTrailingZeros().toPlainString();
        plainString.getClass();
        return plainString;
    }

    public static final qz2 N(qy qyVar, String str, dr0 dr0Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        byte b2 = 1;
        boolean z2 = i3 > 4 && dr0Var.f(qyVar);
        Object objK = dr0Var.K();
        Object obj = zy.a;
        m10 m10Var = null;
        if (z2 || objK == obj) {
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                Object qz2Var = new qz2(qyVar, null, str);
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                dr0Var.f0(qz2Var);
                objK = qz2Var;
            } catch (Throwable th) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                throw th;
            }
        }
        qz2 qz2Var2 = (qz2) objK;
        if (qyVar instanceof pf2) {
            dr0Var.V(-1357398105);
            Object objK2 = dr0Var.K();
            if (objK2 == obj) {
                objK2 = h7.Y(dr0Var);
                dr0Var.f0(objK2);
            }
            Object obj2 = (x20) objK2;
            boolean zH = dr0Var.h(obj2) | (i3 > 4 && dr0Var.f(qyVar));
            Object objK3 = dr0Var.K();
            if (zH || objK3 == obj) {
                objK3 = new uy1((Object) qyVar, obj2, (byte) 22);
                dr0Var.f0(objK3);
            }
            h7.G(obj2, (vp0) objK3, dr0Var);
            pf2 pf2Var = (pf2) qyVar;
            Object value = pf2Var.c.getValue();
            Object value2 = pf2Var.b.getValue();
            boolean z3 = i3 > 4 && dr0Var.f(qyVar);
            Object objK4 = dr0Var.K();
            if (z3 || objK4 == obj) {
                objK4 = new j((Object) qyVar, m10Var, (byte) 17);
                dr0Var.f0(objK4);
            }
            h7.K(value, value2, (zp0) objK4, dr0Var);
            dr0Var.p(false);
        } else {
            dr0Var.V(-1356407283);
            qz2Var2.a(qyVar.i(), dr0Var, 0);
            dr0Var.p(false);
        }
        boolean zF = dr0Var.f(qz2Var2);
        Object objK5 = dr0Var.K();
        if (zF || objK5 == obj) {
            objK5 = new rz2(qz2Var2, b2);
            dr0Var.f0(objK5);
        }
        h7.G(qz2Var2, (vp0) objK5, dr0Var);
        return qz2Var2;
    }

    public static final kg0 O(qz2 qz2Var, vp0 vp0Var, Object obj, dr0 dr0Var) {
        dr0Var.R(-422486566, 0, qz2Var, null);
        boolean zG = qz2Var.g();
        qy qyVar = qz2Var.a;
        kg0 kg0Var = kg0.j;
        kg0 kg0Var2 = kg0.i;
        kg0 kg0Var3 = kg0.h;
        if (zG) {
            dr0Var.V(-212166497);
            dr0Var.p(false);
            if (((Boolean) vp0Var.h(obj)).booleanValue()) {
                kg0Var = kg0Var2;
            } else if (!((Boolean) vp0Var.h(qyVar.g())).booleanValue()) {
                kg0Var = kg0Var3;
            }
        } else {
            dr0Var.V(-211886815);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = rz1.x(Boolean.FALSE);
                dr0Var.f0(objK);
            }
            sj1 sj1Var = (sj1) objK;
            Object value = qz2Var.e.getValue();
            if (((Boolean) vp0Var.h(qyVar.g())).booleanValue() || (value != null && ((Boolean) vp0Var.h(value)).booleanValue())) {
                sj1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) vp0Var.h(obj)).booleanValue()) {
                kg0Var = kg0Var2;
            } else if ((value != null && ((Boolean) vp0Var.h(value)).booleanValue()) || !((Boolean) sj1Var.getValue()).booleanValue()) {
                kg0Var = kg0Var3;
            }
            dr0Var.p(false);
        }
        dr0Var.p(false);
        return kg0Var;
    }

    public static void P(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(wi0.h(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        uz0.x(classCastException, t03.class.getName());
        throw classCastException;
    }

    public static final long Q(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        if (i2 <= 15) {
            return j2;
        }
        if (i2 == uv.u.c) {
            return cu.c0(j2);
        }
        if ((i2 == uv.v.c || i2 == uv.w.c) && Build.VERSION.SDK_INT < 34) {
            return cu.c0(j2);
        }
        return (i2 != uv.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : cu.c0(j2);
    }

    public static final qz2 S(Object obj, String str, dr0 dr0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objK = dr0Var.K();
        yy yyVar = zy.a;
        if (objK == yyVar) {
            objK = new qz2(new tj1(obj), null, str);
            dr0Var.f0(objK);
        }
        qz2 qz2Var = (qz2) objK;
        qz2Var.a(obj, dr0Var, (i2 & 8) | 48 | (i2 & 14));
        Object objK2 = dr0Var.K();
        if (objK2 == yyVar) {
            objK2 = new rz2(qz2Var, (byte) 0);
            dr0Var.f0(objK2);
        }
        h7.G(qz2Var, (vp0) objK2, dr0Var);
        return qz2Var;
    }

    public static final List T(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return ag0.h;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            w61 w61Var = (w61) arrayList.get(i4);
            int index = w61Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(w61Var);
            }
        }
        hv.p0(arrayList2, x);
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:262:0x058c  */
    /* JADX WARN: Code duplicated, block: B:264:0x058f  */
    /* JADX WARN: Code duplicated, block: B:266:0x059d  */
    /* JADX WARN: Code duplicated, block: B:268:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:270:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:272:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:274:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:276:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:278:0x0609  */
    /* JADX WARN: Code duplicated, block: B:280:0x0620  */
    /* JADX WARN: Code duplicated, block: B:283:0x0632  */
    /* JADX WARN: Code duplicated, block: B:285:0x064b  */
    /* JADX WARN: Code duplicated, block: B:287:0x066f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0691  */
    /* JADX WARN: Code duplicated, block: B:303:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:305:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:307:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:309:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:311:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:313:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:315:0x0708  */
    /* JADX WARN: Code duplicated, block: B:317:0x0717  */
    /* JADX WARN: Code duplicated, block: B:318:0x0730  */
    /* JADX WARN: Code duplicated, block: B:323:0x076e  */
    /* JADX WARN: Code duplicated, block: B:327:0x079c  */
    /* JADX WARN: Code duplicated, block: B:331:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:334:0x080c  */
    /* JADX WARN: Code duplicated, block: B:335:0x0817  */
    /* JADX WARN: Code duplicated, block: B:338:0x0835  */
    /* JADX WARN: Code duplicated, block: B:339:0x083b  */
    /* JADX WARN: Code duplicated, block: B:342:0x0852  */
    public static final void a(qz2 qz2Var, vp0 vp0Var, rg1 rg1Var, ah0 ah0Var, wh0 wh0Var, zp0 zp0Var, nx nxVar, dr0 dr0Var, int i2) {
        nx nxVar2;
        boolean z2;
        ck2 ck2Var;
        bs bsVar;
        ah0 ah0Var2;
        wh0 wh0Var2;
        boolean z3;
        boolean z4;
        yy yyVar;
        boolean z5;
        boolean z6;
        lz2 lz2Var;
        lz2 lz2Var2;
        lz2 lz2Var3;
        boolean z7;
        s92 s92Var;
        og1 og1Var;
        si2 si2Var;
        og1 og1Var2;
        rg1 rg1Var2;
        s03 s03Var;
        boolean z8;
        boolean z9;
        si2 si2Var2;
        s03 s03Var2;
        lz2 lz2Var4;
        lz2 lz2Var5;
        lz2 lz2VarQ;
        boolean zH;
        Object objK;
        si2 si2Var3;
        ah0 ah0Var3;
        wh0 wh0Var3;
        boolean zH2;
        Object objK2;
        boolean zG;
        Object objK3;
        Object objK4;
        wc wcVar;
        Integer numValueOf;
        yx yxVar;
        Object objK5;
        Object objK6;
        Object objK7;
        Object objK8;
        Object objK9;
        Object objK10;
        kg0 kg0VarO;
        rg1 rg1Var3 = rg1Var;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(-1310802509);
        int i3 = (i2 & 6) == 0 ? (dr0Var2.f(qz2Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= dr0Var2.h(vp0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var2.f(rg1Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dr0Var2.f(ah0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dr0Var2.f(wh0Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dr0Var2.h(zp0Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= dr0Var2.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= dr0Var2.h(nxVar) ? 67108864 : 33554432;
        }
        int i5 = i4;
        byte b2 = 0;
        if (dr0Var2.N(i5 & 1, (i5 & 38347923) != 38347922)) {
            lu1 lu1Var = qz2Var.e;
            lu1 lu1Var2 = qz2Var.d;
            qy qyVar = qz2Var.a;
            Object value = lu1Var.getValue();
            Object objK11 = dr0Var2.K();
            yy yyVar2 = zy.a;
            if (objK11 == yyVar2) {
                objK11 = rz1.x(Boolean.FALSE);
                dr0Var2.f0(objK11);
            }
            sj1 sj1Var = (sj1) objK11;
            Object objK12 = dr0Var2.K();
            if (objK12 == yyVar2) {
                objK12 = new qc(sj1Var, b2);
                dr0Var2.f0(objK12);
            }
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            vg0.a(qz2Var, (kp0) objK12, dr0Var2, i7);
            if (value != null && ((Boolean) vp0Var.h(value)).booleanValue()) {
                sj1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) vp0Var.h(lu1Var2.getValue())).booleanValue() || ((Boolean) vp0Var.h(qyVar.g())).booleanValue() || ((value != null && ((Boolean) vp0Var.h(value)).booleanValue()) || ((((Boolean) sj1Var.getValue()).booleanValue() && !uz0.g(qyVar.g(), lu1Var2.getValue())) || qz2Var.g() || qz2Var.d()))) {
                dr0Var2.V(-273709037);
                int i8 = i7 & 14;
                boolean z10 = ((i8 ^ 6) > 4 && dr0Var2.f(qz2Var)) || (i7 & 6) == 4;
                Object objK13 = dr0Var2.K();
                if (z10 || objK13 == yyVar2) {
                    objK13 = qyVar.g();
                    dr0Var2.f0(objK13);
                }
                if (qz2Var.g()) {
                    objK13 = qyVar.g();
                }
                dr0Var2.V(2016262395);
                kg0 kg0VarO2 = O(qz2Var, vp0Var, objK13, dr0Var2);
                dr0Var2.p(false);
                Object value2 = lu1Var2.getValue();
                dr0Var2.V(2016262395);
                kg0 kg0VarO3 = O(qz2Var, vp0Var, value2, dr0Var2);
                dr0Var2.p(false);
                int i9 = i8 | 3072;
                int i10 = (i9 & 14) ^ 6;
                boolean z11 = (i10 > 4 && dr0Var2.f(qz2Var)) || (i9 & 6) == 4;
                Object objK14 = dr0Var2.K();
                if (z11 || objK14 == yyVar2) {
                    objK14 = new qz2(new tj1(kg0VarO2), qz2Var, qz2Var.c + " > EnterExitTransition");
                    dr0Var2.f0(objK14);
                }
                qz2 qz2Var2 = (qz2) objK14;
                boolean zF = ((i10 > 4 && dr0Var2.f(qz2Var)) || (i9 & 6) == 4) | dr0Var2.f(qz2Var2);
                Object objK15 = dr0Var2.K();
                if (zF || objK15 == yyVar2) {
                    objK15 = new uy1((Object) qz2Var, (Object) qz2Var2, (byte) 23);
                    dr0Var2.f0(objK15);
                }
                h7.G(qz2Var2, (vp0) objK15, dr0Var2);
                if (qz2Var.g()) {
                    qz2Var2.k(kg0VarO2, kg0VarO3);
                } else {
                    qz2Var2.q(kg0VarO3);
                    qz2Var2.l.setValue(Boolean.FALSE);
                }
                if (qz2Var.g()) {
                    dr0Var2.V(782538635);
                    dr0Var2.p(false);
                } else {
                    dr0Var2.V(782386797);
                    Object value3 = qz2Var.e.getValue();
                    if (value3 == null) {
                        dr0Var2.V(782437481);
                        dr0Var2.p(false);
                        kg0VarO = null;
                    } else {
                        dr0Var2.V(782437482);
                        dr0Var2.V(2016262395);
                        kg0VarO = O(qz2Var, vp0Var, value3, dr0Var2);
                        dr0Var2.p(false);
                        dr0Var2.p(false);
                    }
                    qy qyVar2 = qz2Var2.a;
                    lu1 lu1Var3 = qz2Var2.d;
                    lu1 lu1Var4 = qz2Var2.e;
                    Object value4 = lu1Var4.getValue();
                    boolean z12 = value4 != null && kg0VarO == null && uz0.g(lu1Var3.getValue(), qyVar2.g());
                    lu1Var4.setValue(kg0VarO);
                    if (z12) {
                        qz2Var2.f.setValue(new nz2(value4, lu1Var3.getValue()));
                        qyVar2.n(value4);
                        if (qz2Var2.h.g() == Long.MIN_VALUE) {
                            qz2Var2.o(true);
                        }
                        ll2 ll2Var = qz2Var2.j;
                        int size = ll2Var.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((oz2) ll2Var.get(i11)).o.h(-2.0f);
                        }
                    }
                    dr0Var2.p(false);
                }
                boolean zF2 = dr0Var2.f(qz2Var2);
                Object objK16 = dr0Var2.K();
                if (zF2 || objK16 == yyVar2) {
                    objK16 = rz1.x(ah0Var);
                    dr0Var2.f0(objK16);
                }
                sj1 sj1Var2 = (sj1) objK16;
                qy qyVar3 = qz2Var2.a;
                lu1 lu1Var5 = qz2Var2.d;
                Object objG = qyVar3.g();
                Object value5 = lu1Var5.getValue();
                kg0 kg0Var = kg0.j;
                kg0 kg0Var2 = kg0.i;
                if (objG == value5 && qz2Var2.a.g() == kg0Var2) {
                    if (qz2Var2.g()) {
                        sj1Var2.setValue(ah0Var);
                    } else {
                        sj1Var2.setValue(ah0.b);
                    }
                } else if (lu1Var5.getValue() != kg0Var) {
                    sj1Var2.setValue(((ah0) sj1Var2.getValue()).a(ah0Var));
                }
                ah0 ah0Var4 = (ah0) sj1Var2.getValue();
                lu1 lu1Var6 = qz2Var2.d;
                qy qyVar4 = qz2Var2.a;
                boolean zF3 = dr0Var2.f(qz2Var2);
                Object objK17 = dr0Var2.K();
                if (zF3 || objK17 == yyVar2) {
                    objK17 = rz1.x(wh0Var);
                    dr0Var2.f0(objK17);
                }
                sj1 sj1Var3 = (sj1) objK17;
                if (qyVar4.g() == lu1Var6.getValue() && qyVar4.g() == kg0Var2) {
                    dr0Var2.V(-505142498);
                    dr0Var2.p(false);
                    if (qz2Var2.g()) {
                        sj1Var3.setValue(wh0Var);
                    } else {
                        sj1Var3.setValue(wh0.b);
                    }
                } else if (lu1Var6.getValue() != kg0Var2) {
                    dr0Var2.V(-504838512);
                    ri0 ri0Var = ((wh0) sj1Var3.getValue()).a.a;
                    ri0 ri0Var2 = ri0Var != null ? new ri0(1.0f, ri0Var.b) : null;
                    ad2 ad2Var = ((wh0) sj1Var3.getValue()).a.d;
                    ad2 ad2Var2 = ad2Var != null ? new ad2(1.0f, ad2Var.b, ad2Var.c) : null;
                    ck2 ck2Var2 = ((wh0) sj1Var3.getValue()).a.b;
                    if (ck2Var2 == null) {
                        dr0Var2.V(-504119809);
                        z2 = false;
                        dr0Var2.p(false);
                        ck2Var = null;
                    } else {
                        dr0Var2.V(-708998590);
                        Object objK18 = dr0Var2.K();
                        if (objK18 == yyVar2) {
                            objK18 = wb.q;
                            dr0Var2.f0(objK18);
                        }
                        ck2 ck2Var3 = new ck2((vp0) objK18, ck2Var2.b);
                        z2 = false;
                        dr0Var2.p(false);
                        ck2Var = ck2Var3;
                    }
                    bs bsVar2 = ((wh0) sj1Var3.getValue()).a.c;
                    if (bsVar2 == null) {
                        dr0Var2.V(-504024174);
                        dr0Var2.p(z2);
                        bsVar = null;
                    } else {
                        dr0Var2.V(-708995505);
                        Object objK19 = dr0Var2.K();
                        if (objK19 == yyVar2) {
                            objK19 = wb.r;
                            dr0Var2.f0(objK19);
                        }
                        bs bsVar3 = new bs(bsVar2.a, (vp0) objK19, bsVar2.c);
                        dr0Var2.p(false);
                        bsVar = bsVar3;
                    }
                    pz2 pz2Var = ((wh0) sj1Var3.getValue()).a;
                    sj1Var3.setValue(new wh0(new pz2(ri0Var2, ck2Var, bsVar, ad2Var2, (LinkedHashMap) null, 96)).a(wh0Var));
                    dr0Var2.p(false);
                } else {
                    dr0Var2.V(-503833306);
                    dr0Var2.p(false);
                }
                wh0 wh0Var4 = (wh0) sj1Var3.getValue();
                sj1 sj1VarC = rz1.C(zp0Var, dr0Var2);
                Object objF = zp0Var.f(qyVar4.g(), lu1Var6.getValue());
                boolean zF4 = dr0Var2.f(qz2Var2) | dr0Var2.f(sj1VarC);
                Object objK20 = dr0Var2.K();
                if (zF4 || objK20 == yyVar2) {
                    objK20 = new j(qz2Var2, sj1VarC, null, (byte) 1);
                    dr0Var2.f0(objK20);
                }
                zp0 zp0Var2 = (zp0) objK20;
                Object objK21 = dr0Var2.K();
                if (objK21 == yyVar2) {
                    objK21 = rz1.x(objF);
                    dr0Var2.f0(objK21);
                }
                sj1 sj1Var4 = (sj1) objK21;
                boolean zH3 = dr0Var2.h(zp0Var2);
                Object objK22 = dr0Var2.K();
                if (zH3 || objK22 == yyVar2) {
                    objK22 = new jl2(zp0Var2, sj1Var4, null, (byte) 0);
                    dr0Var2.f0(objK22);
                }
                h7.J((zp0) objK22, dr0Var2, j23.a);
                if (qyVar4.g() == kg0Var && lu1Var6.getValue() == kg0Var && ((Boolean) sj1Var4.getValue()).booleanValue()) {
                    dr0Var2.V(-270520625);
                    dr0Var2.p(false);
                    rg1Var3 = rg1Var;
                    nxVar2 = nxVar;
                    z6 = false;
                } else {
                    dr0Var2.V(-272022668);
                    boolean z13 = i6 == 4;
                    Object objK23 = dr0Var2.K();
                    if (z13 || objK23 == yyVar2) {
                        objK23 = new wc();
                        dr0Var2.f0(objK23);
                    }
                    wc wcVar2 = (wc) objK23;
                    si2 si2Var4 = wcVar2.b;
                    s03 s03Var3 = aa3.W;
                    Object objK24 = dr0Var2.K();
                    if (objK24 == yyVar2) {
                        objK24 = rg0.i;
                        dr0Var2.f0(objK24);
                    }
                    kp0 kp0Var = (kp0) objK24;
                    dr0Var2.V(-1491182875);
                    dr0Var2.p(false);
                    dr0Var2.V(-1491180092);
                    dr0Var2.p(false);
                    dr0Var2.V(-31257052);
                    dr0Var2.p(false);
                    si2Var4.c(qz2Var2.e.getValue() != null);
                    boolean zH4 = dr0Var2.h(si2Var4);
                    Object objK25 = dr0Var2.K();
                    if (zH4 || objK25 == yyVar2) {
                        objK25 = new sg0(si2Var4, (byte) 1);
                        dr0Var2.f0(objK25);
                    }
                    vg0.a(qz2Var2, (kp0) objK25, dr0Var2, 0);
                    pz2 pz2Var2 = ah0Var4.a;
                    pz2 pz2Var3 = wh0Var4.a;
                    boolean zA = r13.a(si2Var4.e, kv.f);
                    ck2 ck2Var4 = pz2Var2.b;
                    bs bsVar4 = pz2Var2.c;
                    if (ck2Var4 == null && pz2Var3.b == null) {
                        ah0Var2 = ah0Var4;
                        wh0Var2 = wh0Var4;
                        z3 = ny0.a(si2Var4.i, 0L) ? false : true;
                        if (bsVar4 == null || pz2Var3.c != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                            dr0Var2 = dr0Var;
                            dr0Var2.V(1018653691);
                            objK10 = dr0Var2.K();
                            if (objK10 == yyVar2) {
                                objK10 = "Built-in slide";
                                dr0Var2.f0("Built-in slide");
                            }
                            String str = (String) objK10;
                            yyVar = yyVar2;
                            z5 = true;
                            z6 = false;
                            lz2 lz2VarQ2 = q(qz2Var2, s03Var3, str, dr0Var2, 384, 0);
                            dr0Var2.p(false);
                            lz2Var = lz2VarQ2;
                        } else {
                            dr0Var2 = dr0Var;
                            yyVar = yyVar2;
                            z5 = true;
                            z6 = false;
                            dr0Var2.V(1018759494);
                            dr0Var2.p(false);
                            lz2Var = null;
                        }
                        if (z4) {
                            dr0Var2.V(1018851285);
                            s03 s03Var4 = aa3.X;
                            objK9 = dr0Var2.K();
                            if (objK9 == yyVar) {
                                objK9 = "Built-in shrink/expand";
                                dr0Var2.f0("Built-in shrink/expand");
                            }
                            lz2 lz2VarQ3 = q(qz2Var2, s03Var4, (String) objK9, dr0Var2, 384, 0);
                            dr0Var2.p(z6);
                            lz2Var2 = lz2VarQ3;
                        } else {
                            dr0Var2.V(1018962109);
                            dr0Var2.p(z6);
                            lz2Var2 = null;
                        }
                        if (z4) {
                            dr0Var2.V(1019035735);
                            objK8 = dr0Var2.K();
                            if (objK8 == yyVar) {
                                objK8 = "Built-in InterruptionHandlingOffset";
                                dr0Var2.f0("Built-in InterruptionHandlingOffset");
                            }
                            lz2 lz2VarQ4 = q(qz2Var2, s03Var3, (String) objK8, dr0Var2, 384, 0);
                            dr0Var2.p(z6);
                            lz2Var3 = lz2VarQ4;
                        } else {
                            dr0Var2.V(1019206141);
                            dr0Var2.p(z6);
                            lz2Var3 = null;
                        }
                        z7 = z4 ^ z5;
                        s92Var = uv.e;
                        og1Var = og1.h;
                        if (zA) {
                            si2Var = si2Var4;
                            og1Var2 = og1Var;
                            dr0Var2.V(1020031362);
                            dr0Var2.p(z6);
                            rg1Var2 = og1Var2;
                        } else {
                            dr0Var2.V(1019733235);
                            s03 s03Var5 = new s03(wb.m, new zb(s92Var, (byte) 2));
                            objK7 = dr0Var2.K();
                            if (objK7 == yyVar) {
                                objK7 = "Built-in veil";
                                dr0Var2.f0("Built-in veil");
                            }
                            og1Var2 = og1Var;
                            x33 x33Var = new x33(qz2Var2, q(qz2Var2, s03Var5, (String) objK7, dr0Var2, 384, 0), ah0Var2, wh0Var2, si2Var4);
                            si2Var = si2Var4;
                            dr0Var2.p(z6);
                            rg1Var2 = x33Var;
                        }
                        s03Var = aa3.Q;
                        if (pz2Var2.a != null && pz2Var3.a == null && si2Var.f == 1.0f) {
                            z8 = z6 ? 1 : 0;
                        } else {
                            z8 = z5;
                        }
                        if (pz2Var2.d != null && pz2Var3.d == null && si2Var.g == 1.0f) {
                            z9 = z6 ? 1 : 0;
                        } else {
                            z9 = z5;
                        }
                        if (z8) {
                            dr0Var2.V(-1511865571);
                            objK6 = dr0Var2.K();
                            if (objK6 == yyVar) {
                                objK6 = "Built-in alpha";
                                dr0Var2.f0("Built-in alpha");
                            }
                            si2 si2Var5 = si2Var;
                            s03Var2 = s03Var;
                            si2Var2 = si2Var5;
                            lz2 lz2VarQ5 = q(qz2Var2, s03Var2, (String) objK6, dr0Var2, 384, 0);
                            dr0Var2.p(z6);
                            lz2Var4 = lz2VarQ5;
                        } else {
                            si2Var2 = si2Var;
                            s03Var2 = s03Var;
                            dr0Var2.V(-1511696126);
                            dr0Var2.p(z6);
                            lz2Var4 = null;
                        }
                        if (z9 != 0) {
                            dr0Var2.V(-1511628483);
                            objK5 = dr0Var2.K();
                            if (objK5 == yyVar) {
                                objK5 = "Built-in scale";
                                dr0Var2.f0("Built-in scale");
                            }
                            lz2 lz2VarQ6 = q(qz2Var2, s03Var2, (String) objK5, dr0Var2, 384, 0);
                            dr0Var2.p(z6);
                            lz2Var5 = lz2VarQ6;
                        } else {
                            dr0Var2.V(-1511459038);
                            dr0Var2.p(z6);
                            lz2Var5 = null;
                        }
                        if (z9) {
                            dr0Var2.V(-1511381382);
                            lz2VarQ = q(qz2Var2, vg0.a, "TransformOriginInterruptionHandling", dr0Var2, 384, 0);
                            dr0Var2.p(z6);
                        } else {
                            dr0Var2.V(-1511209054);
                            dr0Var2.p(z6);
                            lz2VarQ = null;
                        }
                        zH = dr0Var2.h(lz2Var4) | dr0Var2.f(ah0Var2) | dr0Var2.f(wh0Var2) | dr0Var2.h(si2Var2) | dr0Var2.h(lz2Var5) | dr0Var2.f(qz2Var2) | dr0Var2.h(lz2VarQ);
                        objK = dr0Var2.K();
                        if (!zH || objK == yyVar) {
                            si2 si2Var6 = si2Var2;
                            ah0 ah0Var5 = ah0Var2;
                            wh0 wh0Var5 = wh0Var2;
                            objK = new mg0(lz2Var4, si2Var6, lz2Var5, qz2Var2, ah0Var5, wh0Var5, lz2VarQ);
                            si2Var3 = si2Var6;
                            ah0Var3 = ah0Var5;
                            wh0Var3 = wh0Var5;
                            dr0Var2.f0(objK);
                        } else {
                            si2Var3 = si2Var2;
                            ah0Var3 = ah0Var2;
                            wh0Var3 = wh0Var2;
                        }
                        mg0 mg0Var = (mg0) objK;
                        zH2 = dr0Var2.h(si2Var3);
                        objK2 = dr0Var2.K();
                        if (zH2 || objK2 == yyVar) {
                            objK2 = new sg0(si2Var3, z6 ? (byte) 1 : (byte) 0);
                            dr0Var2.f0(objK2);
                        }
                        rg1 rg1VarC = new ug1((kp0) objK2).c(og1Var2);
                        zG = dr0Var2.g(z7) | dr0Var2.f(kp0Var);
                        objK3 = dr0Var2.K();
                        if (zG || objK3 == yyVar) {
                            objK3 = new tg0(kp0Var, z7);
                            dr0Var2.f0(objK3);
                        }
                        rg1 rg1VarC2 = rg1VarC.c(h7.i0(og1Var2, (vp0) objK3)).c(new lg0(qz2Var2, lz2Var2, lz2Var3, lz2Var, ah0Var3, wh0Var3, si2Var3, kp0Var, mg0Var)).c(rg1Var2);
                        dr0Var2.V(-1255657861);
                        dr0Var2.p(z6);
                        rg1Var3 = rg1Var;
                        rg1 rg1VarC3 = rg1Var3.c(rg1VarC2.c(og1Var2));
                        objK4 = dr0Var2.K();
                        if (objK4 == yyVar) {
                            wcVar = wcVar2;
                            objK4 = new pc(wcVar);
                            dr0Var2.f0(objK4);
                        } else {
                            wcVar = wcVar2;
                        }
                        pc pcVar = (pc) objK4;
                        int iHashCode = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL = dr0Var2.l();
                        rg1 rg1VarU = ls.U(dr0Var2, rg1VarC3);
                        sy.f.getClass();
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(l41.W);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(c5.F, dr0Var2, pcVar);
                        h12.y(c5.E, dr0Var2, dx1VarL);
                        numValueOf = Integer.valueOf(iHashCode);
                        yxVar = c5.G;
                        if (dr0Var2.S) {
                            dr0Var2.b(yxVar, numValueOf);
                        }
                        h12.t(dr0Var2);
                        h12.y(c5.D, dr0Var2, rg1VarU);
                        nxVar2 = nxVar;
                        nxVar2.c(wcVar, dr0Var2, Integer.valueOf((i5 >> 21) & 112));
                        dr0Var2.p(true);
                        dr0Var2.p(z6);
                    } else {
                        ah0Var2 = ah0Var4;
                        wh0Var2 = wh0Var4;
                    }
                    if (bsVar4 == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (z3) {
                        dr0Var2 = dr0Var;
                        dr0Var2.V(1018653691);
                        objK10 = dr0Var2.K();
                        if (objK10 == yyVar2) {
                            objK10 = "Built-in slide";
                            dr0Var2.f0("Built-in slide");
                        }
                        String str2 = (String) objK10;
                        yyVar = yyVar2;
                        z5 = true;
                        z6 = false;
                        lz2 lz2VarQ7 = q(qz2Var2, s03Var3, str2, dr0Var2, 384, 0);
                        dr0Var2.p(false);
                        lz2Var = lz2VarQ7;
                    } else {
                        dr0Var2 = dr0Var;
                        yyVar = yyVar2;
                        z5 = true;
                        z6 = false;
                        dr0Var2.V(1018759494);
                        dr0Var2.p(false);
                        lz2Var = null;
                    }
                    if (z4) {
                        dr0Var2.V(1018851285);
                        s03 s03Var6 = aa3.X;
                        objK9 = dr0Var2.K();
                        if (objK9 == yyVar) {
                            objK9 = "Built-in shrink/expand";
                            dr0Var2.f0("Built-in shrink/expand");
                        }
                        lz2 lz2VarQ8 = q(qz2Var2, s03Var6, (String) objK9, dr0Var2, 384, 0);
                        dr0Var2.p(z6);
                        lz2Var2 = lz2VarQ8;
                    } else {
                        dr0Var2.V(1018962109);
                        dr0Var2.p(z6);
                        lz2Var2 = null;
                    }
                    if (z4) {
                        dr0Var2.V(1019035735);
                        objK8 = dr0Var2.K();
                        if (objK8 == yyVar) {
                            objK8 = "Built-in InterruptionHandlingOffset";
                            dr0Var2.f0("Built-in InterruptionHandlingOffset");
                        }
                        lz2 lz2VarQ9 = q(qz2Var2, s03Var3, (String) objK8, dr0Var2, 384, 0);
                        dr0Var2.p(z6);
                        lz2Var3 = lz2VarQ9;
                    } else {
                        dr0Var2.V(1019206141);
                        dr0Var2.p(z6);
                        lz2Var3 = null;
                    }
                    z7 = z4 ^ z5;
                    s92Var = uv.e;
                    og1Var = og1.h;
                    if (zA) {
                        dr0Var2.V(1019733235);
                        s03 s03Var7 = new s03(wb.m, new zb(s92Var, (byte) 2));
                        objK7 = dr0Var2.K();
                        if (objK7 == yyVar) {
                            objK7 = "Built-in veil";
                            dr0Var2.f0("Built-in veil");
                        }
                        og1Var2 = og1Var;
                        x33 x33Var2 = new x33(qz2Var2, q(qz2Var2, s03Var7, (String) objK7, dr0Var2, 384, 0), ah0Var2, wh0Var2, si2Var4);
                        si2Var = si2Var4;
                        dr0Var2.p(z6);
                        rg1Var2 = x33Var2;
                    } else {
                        si2Var = si2Var4;
                        og1Var2 = og1Var;
                        dr0Var2.V(1020031362);
                        dr0Var2.p(z6);
                        rg1Var2 = og1Var2;
                    }
                    s03Var = aa3.Q;
                    if (pz2Var2.a != null) {
                        z8 = z5;
                    } else {
                        z8 = z5;
                    }
                    if (pz2Var2.d != null) {
                        z9 = z5;
                    } else {
                        z9 = z5;
                    }
                    if (z8) {
                        dr0Var2.V(-1511865571);
                        objK6 = dr0Var2.K();
                        if (objK6 == yyVar) {
                            objK6 = "Built-in alpha";
                            dr0Var2.f0("Built-in alpha");
                        }
                        si2 si2Var7 = si2Var;
                        s03Var2 = s03Var;
                        si2Var2 = si2Var7;
                        lz2 lz2VarQ10 = q(qz2Var2, s03Var2, (String) objK6, dr0Var2, 384, 0);
                        dr0Var2.p(z6);
                        lz2Var4 = lz2VarQ10;
                    } else {
                        si2Var2 = si2Var;
                        s03Var2 = s03Var;
                        dr0Var2.V(-1511696126);
                        dr0Var2.p(z6);
                        lz2Var4 = null;
                    }
                    if (z9 != 0) {
                        dr0Var2.V(-1511628483);
                        objK5 = dr0Var2.K();
                        if (objK5 == yyVar) {
                            objK5 = "Built-in scale";
                            dr0Var2.f0("Built-in scale");
                        }
                        lz2 lz2VarQ11 = q(qz2Var2, s03Var2, (String) objK5, dr0Var2, 384, 0);
                        dr0Var2.p(z6);
                        lz2Var5 = lz2VarQ11;
                    } else {
                        dr0Var2.V(-1511459038);
                        dr0Var2.p(z6);
                        lz2Var5 = null;
                    }
                    if (z9) {
                        dr0Var2.V(-1511381382);
                        lz2VarQ = q(qz2Var2, vg0.a, "TransformOriginInterruptionHandling", dr0Var2, 384, 0);
                        dr0Var2.p(z6);
                    } else {
                        dr0Var2.V(-1511209054);
                        dr0Var2.p(z6);
                        lz2VarQ = null;
                    }
                    zH = dr0Var2.h(lz2Var4) | dr0Var2.f(ah0Var2) | dr0Var2.f(wh0Var2) | dr0Var2.h(si2Var2) | dr0Var2.h(lz2Var5) | dr0Var2.f(qz2Var2) | dr0Var2.h(lz2VarQ);
                    objK = dr0Var2.K();
                    if (zH) {
                        si2 si2Var8 = si2Var2;
                        ah0 ah0Var6 = ah0Var2;
                        wh0 wh0Var6 = wh0Var2;
                        objK = new mg0(lz2Var4, si2Var8, lz2Var5, qz2Var2, ah0Var6, wh0Var6, lz2VarQ);
                        si2Var3 = si2Var8;
                        ah0Var3 = ah0Var6;
                        wh0Var3 = wh0Var6;
                        dr0Var2.f0(objK);
                    } else {
                        si2 si2Var9 = si2Var2;
                        ah0 ah0Var7 = ah0Var2;
                        wh0 wh0Var7 = wh0Var2;
                        objK = new mg0(lz2Var4, si2Var9, lz2Var5, qz2Var2, ah0Var7, wh0Var7, lz2VarQ);
                        si2Var3 = si2Var9;
                        ah0Var3 = ah0Var7;
                        wh0Var3 = wh0Var7;
                        dr0Var2.f0(objK);
                    }
                    mg0 mg0Var2 = (mg0) objK;
                    zH2 = dr0Var2.h(si2Var3);
                    objK2 = dr0Var2.K();
                    if (zH2) {
                        objK2 = new sg0(si2Var3, z6 ? (byte) 1 : (byte) 0);
                        dr0Var2.f0(objK2);
                    } else {
                        objK2 = new sg0(si2Var3, z6 ? (byte) 1 : (byte) 0);
                        dr0Var2.f0(objK2);
                    }
                    rg1 rg1VarC4 = new ug1((kp0) objK2).c(og1Var2);
                    zG = dr0Var2.g(z7) | dr0Var2.f(kp0Var);
                    objK3 = dr0Var2.K();
                    if (zG) {
                        objK3 = new tg0(kp0Var, z7);
                        dr0Var2.f0(objK3);
                    } else {
                        objK3 = new tg0(kp0Var, z7);
                        dr0Var2.f0(objK3);
                    }
                    rg1 rg1VarC5 = rg1VarC4.c(h7.i0(og1Var2, (vp0) objK3)).c(new lg0(qz2Var2, lz2Var2, lz2Var3, lz2Var, ah0Var3, wh0Var3, si2Var3, kp0Var, mg0Var2)).c(rg1Var2);
                    dr0Var2.V(-1255657861);
                    dr0Var2.p(z6);
                    rg1Var3 = rg1Var;
                    rg1 rg1VarC6 = rg1Var3.c(rg1VarC5.c(og1Var2));
                    objK4 = dr0Var2.K();
                    if (objK4 == yyVar) {
                        wcVar = wcVar2;
                        objK4 = new pc(wcVar);
                        dr0Var2.f0(objK4);
                    } else {
                        wcVar = wcVar2;
                    }
                    pc pcVar2 = (pc) objK4;
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarC6);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(l41.W);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, pcVar2);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    numValueOf = Integer.valueOf(iHashCode2);
                    yxVar = c5.G;
                    if (dr0Var2.S) {
                        dr0Var2.b(yxVar, numValueOf);
                    }
                    h12.t(dr0Var2);
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    nxVar2 = nxVar;
                    nxVar2.c(wcVar, dr0Var2, Integer.valueOf((i5 >> 21) & 112));
                    dr0Var2.p(true);
                    dr0Var2.p(z6);
                }
                dr0Var2.p(z6);
            } else {
                dr0Var2.V(-270514673);
                dr0Var2.p(false);
                nxVar2 = nxVar;
            }
        } else {
            nxVar2 = nxVar;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new yb(qz2Var, vp0Var, rg1Var3, ah0Var, wh0Var, zp0Var, nxVar2, i2);
        }
    }

    public static final void b(boolean z2, rg1 rg1Var, ah0 ah0Var, wh0 wh0Var, String str, nx nxVar, dr0 dr0Var, int i2) {
        String str2;
        dr0Var.W(-1448730565);
        int i3 = i2 | (dr0Var.g(z2) ? 4 : 2) | (dr0Var.f(ah0Var) ? 256 : 128) | (dr0Var.f(wh0Var) ? 2048 : 1024) | 24576;
        if (dr0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            qz2 qz2VarS = S(Boolean.valueOf(z2), "AnimatedVisibility", dr0Var, (i3 & 14) | 48, 0);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = wb.l;
                dr0Var.f0(objK);
            }
            int i4 = i3 << 3;
            c(qz2VarS, (vp0) objK, rg1Var, ah0Var, wh0Var, nxVar, dr0Var, 432 | (i4 & 7168) | (i4 & 57344) | 1572864);
            str2 = "AnimatedVisibility";
        } else {
            dr0Var.Q();
            str2 = str;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new sc(z2, rg1Var, ah0Var, wh0Var, str2, nxVar, i2);
        }
    }

    public static final void c(qz2 qz2Var, vp0 vp0Var, rg1 rg1Var, ah0 ah0Var, wh0 wh0Var, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        ah0 ah0Var2;
        wh0 wh0Var2;
        nx nxVar2;
        dr0Var.W(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(qz2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.h(vp0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.f(rg1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ah0Var2 = ah0Var;
            i3 |= dr0Var.f(ah0Var2) ? 2048 : 1024;
        } else {
            ah0Var2 = ah0Var;
        }
        if ((i2 & 24576) == 0) {
            wh0Var2 = wh0Var;
            i3 |= dr0Var.f(wh0Var2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        } else {
            wh0Var2 = wh0Var;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            nxVar2 = nxVar;
            i4 |= dr0Var.h(nxVar2) ? 1048576 : 524288;
        } else {
            nxVar2 = nxVar;
        }
        if (dr0Var.N(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z2 || objK == yyVar) {
                objK = new uc(vp0Var, qz2Var);
                dr0Var.f0(objK);
            }
            rg1 rg1VarN = uz0.n(rg1Var, (aq0) objK);
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = ec.k;
                dr0Var.f0(objK2);
            }
            int i7 = i6 | 196608 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            a(qz2Var, vp0Var, rg1VarN, ah0Var2, wh0Var2, (zp0) objK2, nxVar2, dr0Var, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new xb(qz2Var, vp0Var, rg1Var, ah0Var, wh0Var, nxVar, i2);
        }
    }

    public static final void d(rg1 rg1Var, hi2 hi2Var, ar arVar, br brVar, nx nxVar, dr0 dr0Var, int i2) {
        nx nxVar2;
        hi2 hi2Var2;
        ar arVar2;
        br brVar2;
        ar arVar3;
        hi2 hi2Var3;
        br brVar3;
        dr0Var.W(1359693790);
        int i3 = i2 | 25744;
        if (dr0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                hi2 hi2VarA = mi2.a(h7.G, dr0Var);
                pv pvVar = (pv) dr0Var.j(rv.a);
                ar arVar4 = pvVar.Z;
                if (arVar4 == null) {
                    qv qvVar = h7.F;
                    arVar3 = new ar(rv.c(pvVar, qvVar), rv.a(pvVar, rv.c(pvVar, qvVar)), cu.x(kv.b(h7.I, rv.c(pvVar, h7.H)), rv.c(pvVar, qvVar)), kv.b(0.38f, rv.a(pvVar, rv.c(pvVar, qvVar))));
                    pvVar.Z = arVar3;
                } else {
                    arVar3 = arVar4;
                }
                hi2Var3 = hi2VarA;
                brVar3 = new br(h7.K, h7.J);
            } else {
                dr0Var.Q();
                hi2Var3 = hi2Var;
                arVar3 = arVar;
                brVar3 = brVar;
            }
            dr0Var.q();
            long j2 = arVar3.a;
            long j3 = arVar3.b;
            brVar3.getClass();
            dr0Var.V(-1763481333);
            dr0Var.V(167751211);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = rz1.x(new cc0(0.0f));
                dr0Var.f0(objK);
            }
            dr0Var.p(false);
            dr0Var.p(false);
            nxVar2 = nxVar;
            iq2.a(rg1Var, hi2Var3, j2, j3, ((cc0) ((sj1) objK).getValue()).h, dt.N(-97109725, new v4(nxVar2, (byte) 2), dr0Var), dr0Var, 14155782, 16);
            hi2Var2 = hi2Var3;
            arVar2 = arVar3;
            brVar2 = brVar3;
        } else {
            nxVar2 = nxVar;
            dr0Var.Q();
            hi2Var2 = hi2Var;
            arVar2 = arVar;
            brVar2 = brVar;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new cr(rg1Var, hi2Var2, arVar2, brVar2, nxVar2, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x010a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    /* JADX WARN: Code duplicated, block: B:81:0x011d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:88:0x0181  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void e(final String str, final String str2, final vp0 vp0Var, final String str3, final rg1 rg1Var, boolean z2, String str4, dr0 dr0Var, final int i2, final int i3) {
        boolean z3;
        int i4;
        String str5;
        int i5;
        byte b2;
        byte b3;
        boolean z4;
        final boolean z5;
        final String str6;
        e72 e72VarR;
        boolean z6;
        nx nxVarN;
        String str7;
        boolean z7;
        nx nxVar;
        int i6;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objK;
        str2.getClass();
        vp0Var.getClass();
        dr0Var.W(1858723010);
        int i7 = (dr0Var.f(str2) ? 32 : 16) | i2 | (dr0Var.h(vp0Var) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i7 |= dr0Var.f(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= dr0Var.f(rg1Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        int i8 = i3 & 32;
        if (i8 == 0) {
            if ((196608 & i2) == 0) {
                z3 = z2;
                i7 |= dr0Var.g(z3) ? 131072 : 65536;
            }
            i4 = i3 & 64;
            if (i4 != 0) {
                if ((i2 & 1572864) == 0) {
                    str5 = str4;
                    if (dr0Var.f(str5)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i7 |= i5;
                }
                b2 = 1;
                b3 = 0;
                if ((599187 & i7) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dr0Var.N(i7 & 1, z4)) {
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    nxVarN = null;
                    if (i4 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (str3 != null) {
                        dr0Var.V(-1795480244);
                        nx nxVarN2 = dt.N(1983970658, new xn0(str3, b3), dr0Var);
                        dr0Var.p(false);
                        z7 = true;
                        nxVar = nxVarN2;
                    } else {
                        dr0Var.V(-1795480245);
                        dr0Var.p(false);
                        z7 = false;
                        nxVar = null;
                    }
                    if (str7 == null) {
                        dr0Var.V(-1795433621);
                    } else {
                        dr0Var.V(-1795433620);
                        nxVarN = dt.N(-1033001550, new xn0(str7, b2), dr0Var);
                    }
                    dr0Var.p(false);
                    nx nxVar2 = nxVarN;
                    if (z6) {
                        i6 = 3;
                    } else {
                        i6 = 9;
                    }
                    c31 c31Var = new c31(i6, 6, 115);
                    if ((458752 & i7) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((i7 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z8 | z9;
                    objK = dr0Var.K();
                    if (z10 || objK == zy.a) {
                        objK = new yn0(z6, vp0Var, (byte) 0);
                        dr0Var.f0(objK);
                    }
                    ls.h(str2, (vp0) objK, rg1Var, false, null, dt.N(-832123416, new xn0(str, (byte) 2), dr0Var), null, null, nxVar2, nxVar, z7, null, c31Var, null, true, 0, 0, null, null, dr0Var, ((i7 >> 3) & 14) | 1572864 | ((i7 >> 6) & 896), 12582912, 8210360);
                    z5 = z6;
                    str6 = str7;
                } else {
                    dr0Var.Q();
                    z5 = z3;
                    str6 = str5;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: zn0
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t03.e(str, str2, vp0Var, str3, rg1Var, z5, str6, (dr0) obj, m02.A(i2 | 1), i3);
                            return j23.a;
                        }
                    };
                }
            }
            i7 |= 1572864;
            str5 = str4;
            b2 = 1;
            b3 = 0;
            if ((599187 & i7) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i7 & 1, z4)) {
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                nxVarN = null;
                if (i4 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (str3 != null) {
                    dr0Var.V(-1795480244);
                    nx nxVarN3 = dt.N(1983970658, new xn0(str3, b3), dr0Var);
                    dr0Var.p(false);
                    z7 = true;
                    nxVar = nxVarN3;
                } else {
                    dr0Var.V(-1795480245);
                    dr0Var.p(false);
                    z7 = false;
                    nxVar = null;
                }
                if (str7 == null) {
                    dr0Var.V(-1795433621);
                } else {
                    dr0Var.V(-1795433620);
                    nxVarN = dt.N(-1033001550, new xn0(str7, b2), dr0Var);
                }
                dr0Var.p(false);
                nx nxVar3 = nxVarN;
                if (z6) {
                    i6 = 3;
                } else {
                    i6 = 9;
                }
                c31 c31Var2 = new c31(i6, 6, 115);
                if ((458752 & i7) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i7 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9;
                objK = dr0Var.K();
                if (z10) {
                    objK = new yn0(z6, vp0Var, (byte) 0);
                    dr0Var.f0(objK);
                } else {
                    objK = new yn0(z6, vp0Var, (byte) 0);
                    dr0Var.f0(objK);
                }
                ls.h(str2, (vp0) objK, rg1Var, false, null, dt.N(-832123416, new xn0(str, (byte) 2), dr0Var), null, null, nxVar3, nxVar, z7, null, c31Var2, null, true, 0, 0, null, null, dr0Var, ((i7 >> 3) & 14) | 1572864 | ((i7 >> 6) & 896), 12582912, 8210360);
                z5 = z6;
                str6 = str7;
            } else {
                dr0Var.Q();
                z5 = z3;
                str6 = str5;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: zn0
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t03.e(str, str2, vp0Var, str3, rg1Var, z5, str6, (dr0) obj, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 196608;
        z3 = z2;
        i4 = i3 & 64;
        if (i4 != 0) {
            if ((i2 & 1572864) == 0) {
                str5 = str4;
                if (dr0Var.f(str5)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i7 |= i5;
            }
            b2 = 1;
            b3 = 0;
            if ((599187 & i7) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i7 & 1, z4)) {
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                nxVarN = null;
                if (i4 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (str3 != null) {
                    dr0Var.V(-1795480244);
                    nx nxVarN4 = dt.N(1983970658, new xn0(str3, b3), dr0Var);
                    dr0Var.p(false);
                    z7 = true;
                    nxVar = nxVarN4;
                } else {
                    dr0Var.V(-1795480245);
                    dr0Var.p(false);
                    z7 = false;
                    nxVar = null;
                }
                if (str7 == null) {
                    dr0Var.V(-1795433621);
                } else {
                    dr0Var.V(-1795433620);
                    nxVarN = dt.N(-1033001550, new xn0(str7, b2), dr0Var);
                }
                dr0Var.p(false);
                nx nxVar4 = nxVarN;
                if (z6) {
                    i6 = 3;
                } else {
                    i6 = 9;
                }
                c31 c31Var3 = new c31(i6, 6, 115);
                if ((458752 & i7) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i7 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9;
                objK = dr0Var.K();
                if (z10) {
                    objK = new yn0(z6, vp0Var, (byte) 0);
                    dr0Var.f0(objK);
                } else {
                    objK = new yn0(z6, vp0Var, (byte) 0);
                    dr0Var.f0(objK);
                }
                ls.h(str2, (vp0) objK, rg1Var, false, null, dt.N(-832123416, new xn0(str, (byte) 2), dr0Var), null, null, nxVar4, nxVar, z7, null, c31Var3, null, true, 0, 0, null, null, dr0Var, ((i7 >> 3) & 14) | 1572864 | ((i7 >> 6) & 896), 12582912, 8210360);
                z5 = z6;
                str6 = str7;
            } else {
                dr0Var.Q();
                z5 = z3;
                str6 = str5;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: zn0
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t03.e(str, str2, vp0Var, str3, rg1Var, z5, str6, (dr0) obj, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 1572864;
        str5 = str4;
        b2 = 1;
        b3 = 0;
        if ((599187 & i7) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dr0Var.N(i7 & 1, z4)) {
            if (i8 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            nxVarN = null;
            if (i4 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (str3 != null) {
                dr0Var.V(-1795480244);
                nx nxVarN5 = dt.N(1983970658, new xn0(str3, b3), dr0Var);
                dr0Var.p(false);
                z7 = true;
                nxVar = nxVarN5;
            } else {
                dr0Var.V(-1795480245);
                dr0Var.p(false);
                z7 = false;
                nxVar = null;
            }
            if (str7 == null) {
                dr0Var.V(-1795433621);
            } else {
                dr0Var.V(-1795433620);
                nxVarN = dt.N(-1033001550, new xn0(str7, b2), dr0Var);
            }
            dr0Var.p(false);
            nx nxVar5 = nxVarN;
            if (z6) {
                i6 = 3;
            } else {
                i6 = 9;
            }
            c31 c31Var4 = new c31(i6, 6, 115);
            if ((458752 & i7) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i7 & 896) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z8 | z9;
            objK = dr0Var.K();
            if (z10) {
                objK = new yn0(z6, vp0Var, (byte) 0);
                dr0Var.f0(objK);
            } else {
                objK = new yn0(z6, vp0Var, (byte) 0);
                dr0Var.f0(objK);
            }
            ls.h(str2, (vp0) objK, rg1Var, false, null, dt.N(-832123416, new xn0(str, (byte) 2), dr0Var), null, null, nxVar5, nxVar, z7, null, c31Var4, null, true, 0, 0, null, null, dr0Var, ((i7 >> 3) & 14) | 1572864 | ((i7 >> 6) & 896), 12582912, 8210360);
            z5 = z6;
            str6 = str7;
        } else {
            dr0Var.Q();
            z5 = z3;
            str6 = str5;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: zn0
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t03.e(str, str2, vp0Var, str3, rg1Var, z5, str6, (dr0) obj, m02.A(i2 | 1), i3);
                    return j23.a;
                }
            };
        }
    }

    public static rt1 f(int i2) {
        float f2 = (i2 & 1) != 0 ? 0.0f : 8.0f;
        float f3 = (i2 & 2) != 0 ? 0.0f : 8.0f;
        return new rt1(f2, f3, f2, f3);
    }

    public static rt1 g(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new rt1(f2, f3, f4, f5);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void h(final String str, final String str2, final vp0 vp0Var, final String str3, rg1 rg1Var, int i2, dr0 dr0Var, final int i3, final int i4) {
        int i5;
        byte b2;
        boolean z2;
        final rg1 rg1Var2;
        final int i6;
        e72 e72VarR;
        byte b3;
        nx nxVarN;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objK;
        str2.getClass();
        vp0Var.getClass();
        dr0Var.W(-404614508);
        int i7 = i3 | (dr0Var.f(str2) ? 32 : 16) | (dr0Var.h(vp0Var) ? 256 : 128) | (dr0Var.f(str3) ? 2048 : 1024);
        int i8 = i7 | 24576;
        int i9 = i4 & 32;
        if (i9 == 0) {
            if ((i3 & 196608) == 0) {
                i5 = i2;
                i8 |= dr0Var.d(i5) ? 131072 : 65536;
            }
            b2 = 0;
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dr0Var.N(i8 & 1, z2)) {
                if (i9 != 0) {
                    i5 = 40;
                }
                b3 = 3;
                if (str3 != null) {
                    dr0Var.V(2102782522);
                    nxVarN = dt.N(-753895851, new xn0(str3, b3), dr0Var);
                    dr0Var.p(false);
                    z3 = true;
                } else {
                    dr0Var.V(2102782521);
                    dr0Var.p(false);
                    nxVarN = null;
                    z3 = false;
                }
                nx nxVar = nxVarN;
                c31 c31Var = new c31(0, 6, 119);
                yi0 yi0Var = yj2.a;
                if ((458752 & i8) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | ((i8 & 896) == 256);
                objK = dr0Var.K();
                if (z5 || objK == zy.a) {
                    objK = new ao0(i5, vp0Var, b2);
                    dr0Var.f0(objK);
                }
                ls.h(str2, (vp0) objK, yi0Var, false, null, dt.N(43400110, new xn0(str, (byte) 4), dr0Var), null, null, null, nxVar, z3, null, c31Var, null, true, 0, 0, null, null, dr0Var, ((i8 >> 3) & 14) | 1572864, 12779520, 8212408);
                rg1Var2 = og1.h;
            } else {
                dr0Var.Q();
                rg1Var2 = rg1Var;
            }
            i6 = i5;
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: bo0
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t03.h(str, str2, vp0Var, str3, rg1Var2, i6, (dr0) obj, m02.A(i3 | 1), i4);
                        return j23.a;
                    }
                };
            }
        }
        i8 = 221184 | i7;
        i5 = i2;
        b2 = 0;
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dr0Var.N(i8 & 1, z2)) {
            if (i9 != 0) {
                i5 = 40;
            }
            b3 = 3;
            if (str3 != null) {
                dr0Var.V(2102782522);
                nxVarN = dt.N(-753895851, new xn0(str3, b3), dr0Var);
                dr0Var.p(false);
                z3 = true;
            } else {
                dr0Var.V(2102782521);
                dr0Var.p(false);
                nxVarN = null;
                z3 = false;
            }
            nx nxVar2 = nxVarN;
            c31 c31Var2 = new c31(0, 6, 119);
            yi0 yi0Var2 = yj2.a;
            if ((458752 & i8) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | ((i8 & 896) == 256);
            objK = dr0Var.K();
            if (z5) {
                objK = new ao0(i5, vp0Var, b2);
                dr0Var.f0(objK);
            } else {
                objK = new ao0(i5, vp0Var, b2);
                dr0Var.f0(objK);
            }
            ls.h(str2, (vp0) objK, yi0Var2, false, null, dt.N(43400110, new xn0(str, (byte) 4), dr0Var), null, null, null, nxVar2, z3, null, c31Var2, null, true, 0, 0, null, null, dr0Var, ((i8 >> 3) & 14) | 1572864, 12779520, 8212408);
            rg1Var2 = og1.h;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
        }
        i6 = i5;
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: bo0
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t03.h(str, str2, vp0Var, str3, rg1Var2, i6, (dr0) obj, m02.A(i3 | 1), i4);
                    return j23.a;
                }
            };
        }
    }

    public static final void i(qz2 qz2Var, oz2 oz2Var, Object obj, Object obj2, oj0 oj0Var, dr0 dr0Var, int i2) {
        dr0Var.W(867041821);
        int i3 = (dr0Var.f(qz2Var) ? 4 : 2) | i2 | (dr0Var.f(oz2Var) ? 32 : 16) | (dr0Var.f(obj) ? 256 : 128) | (dr0Var.f(obj2) ? 2048 : 1024) | (dr0Var.f(oj0Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192);
        if (!dr0Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            dr0Var.Q();
        } else if (qz2Var.g()) {
            oz2Var.f(obj, obj2, oj0Var);
        } else {
            oz2Var.g(obj2, oj0Var, null, null);
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new cr(qz2Var, oz2Var, obj, obj2, oj0Var, i2, (byte) 4);
        }
    }

    public static Map j(Object obj) {
        if ((obj instanceof l21) && !(obj instanceof n21)) {
            P(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            uz0.x(e2, t03.class.getName());
            throw e2;
        }
    }

    public static void k(int i2, Object obj) {
        if (obj == null || x(i2, obj)) {
            return;
        }
        P(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final Bundle l(wt1... wt1VarArr) {
        Bundle bundle = new Bundle(wt1VarArr.length);
        for (wt1 wt1Var : wt1VarArr) {
            String str = (String) wt1Var.h;
            Object obj = wt1Var.i;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        wg.m(jp1.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    wg.m(jp1.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final Set m(rh2 rh2Var) {
        rh2Var.getClass();
        if (rh2Var instanceof aq) {
            return ((aq) rh2Var).g();
        }
        HashSet hashSet = new HashSet(rh2Var.d());
        int iD = rh2Var.d();
        for (int i2 = 0; i2 < iD; i2++) {
            hashSet.add(rh2Var.e(i2));
        }
        return hashSet;
    }

    public static final float n(pt1 pt1Var, u31 u31Var) {
        return u31Var == u31.h ? pt1Var.b(u31Var) : pt1Var.a(u31Var);
    }

    public static final float o(pt1 pt1Var, u31 u31Var) {
        return u31Var == u31.h ? pt1Var.a(u31Var) : pt1Var.b(u31Var);
    }

    public static final rh2[] p(List list) {
        rh2[] rh2VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (rh2VarArr = (rh2[]) list.toArray(new rh2[0])) == null) ? z : rh2VarArr;
    }

    public static final lz2 q(qz2 qz2Var, s03 s03Var, String str, dr0 dr0Var, int i2, int i3) {
        kz2 kz2Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = dr0Var.f(qz2Var);
        Object objK = dr0Var.K();
        Object obj = zy.a;
        if (zF || objK == obj) {
            objK = new lz2(qz2Var, s03Var, str);
            dr0Var.f0(objK);
        }
        lz2 lz2Var = (lz2) objK;
        boolean zF2 = dr0Var.f(qz2Var) | dr0Var.h(lz2Var);
        Object objK2 = dr0Var.K();
        if (zF2 || objK2 == obj) {
            objK2 = new uy1((Object) qz2Var, (Object) lz2Var, (byte) 24);
            dr0Var.f0(objK2);
        }
        h7.G(lz2Var, (vp0) objK2, dr0Var);
        if (qz2Var.g() && (kz2Var = (kz2) lz2Var.b.getValue()) != null) {
            qz2 qz2Var2 = lz2Var.c;
            kz2Var.h.f(kz2Var.j.h(qz2Var2.f().b()), kz2Var.j.h(qz2Var2.f().d()), (oj0) kz2Var.i.h(qz2Var2.f()));
        }
        return lz2Var;
    }

    public static final oz2 s(qz2 qz2Var, Object obj, Object obj2, oj0 oj0Var, s03 s03Var, dr0 dr0Var, int i2) {
        boolean zF = dr0Var.f(qz2Var);
        Object objK = dr0Var.K();
        Object obj3 = zy.a;
        if (zF || objK == obj3) {
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                id idVar = (id) s03Var.a.h(obj2);
                idVar.d();
                objK = new oz2(qz2Var, obj, idVar, s03Var);
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                dr0Var.f0(objK);
            } catch (Throwable th) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                throw th;
            }
        }
        oz2 oz2Var = (oz2) objK;
        i(qz2Var, oz2Var, obj, obj2, oj0Var, dr0Var, 0);
        boolean zF2 = dr0Var.f(qz2Var) | dr0Var.f(oz2Var);
        Object objK2 = dr0Var.K();
        if (zF2 || objK2 == obj3) {
            objK2 = new uy1((Object) qz2Var, (Object) oz2Var, (byte) 21);
            dr0Var.f0(objK2);
        }
        h7.G(oz2Var, (vp0) objK2, dr0Var);
        return oz2Var;
    }

    public static final String t(int i2, double d2) {
        String plainString = BigDecimal.valueOf(d2).setScale(i2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
        plainString.getClass();
        return plainString;
    }

    public static final void u(uh1 uh1Var, wq wqVar, zo zoVar, float f2, ei2 ei2Var, vt2 vt2Var, ud0 ud0Var) {
        ArrayList arrayList = uh1Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yt1 yt1Var = (yt1) arrayList.get(i2);
            yt1Var.a.f(wqVar, zoVar, f2, ei2Var, vt2Var, ud0Var);
            wqVar.g(0.0f, yt1Var.a.f);
        }
    }

    public static void w(double d2, int i2, int i3, int i4, int i5, int i6, double[] dArr, double[] dArr2) {
        int i7 = 0;
        if (i4 == 1 && i6 == 1) {
            while (i7 < i2) {
                int i8 = i5 + i7;
                dArr2[i8] = (dArr[i3 + i7] * d2) + dArr2[i8];
                i7++;
            }
            return;
        }
        if (i4 < 0) {
            i3 -= (i2 - 1) * i4;
        }
        if (i6 < 0) {
            i5 -= (i2 - 1) * i6;
        }
        while (i7 < i2) {
            dArr2[i5] = (dArr[i3] * d2) + dArr2[i5];
            i7++;
            i3 += i4;
            i5 += i6;
        }
    }

    public static boolean x(int i2, Object obj) {
        int iB;
        if (obj instanceof hq0) {
            if (obj instanceof jq0) {
                iB = ((jq0) obj).b();
            } else if (obj instanceof kp0) {
                iB = 0;
            } else if (obj instanceof vp0) {
                iB = 1;
            } else if (obj instanceof zp0) {
                iB = 2;
            } else if (obj instanceof aq0) {
                iB = 3;
            } else if (obj instanceof bq0) {
                iB = 4;
            } else if (obj instanceof cq0) {
                iB = 5;
            } else if (obj instanceof dq0) {
                iB = 6;
            } else if (obj instanceof eq0) {
                iB = 7;
            } else if (obj instanceof fq0) {
                iB = 8;
            } else if (obj instanceof gq0) {
                iB = 9;
            } else if (obj instanceof lp0) {
                iB = 10;
            } else if (obj instanceof mp0) {
                iB = 11;
            } else if (obj instanceof op0) {
                iB = 13;
            } else if (obj instanceof pp0) {
                iB = 14;
            } else if (obj instanceof qp0) {
                iB = 15;
            } else if (obj instanceof rp0) {
                iB = 16;
            } else if (obj instanceof sp0) {
                iB = 17;
            } else if (obj instanceof tp0) {
                iB = 18;
            } else if (obj instanceof up0) {
                iB = 19;
            } else if (obj instanceof wp0) {
                iB = 20;
            } else {
                iB = obj instanceof xp0 ? 21 : -1;
            }
            if (iB == i2) {
                return true;
            }
        }
        return false;
    }

    public static final int y(w61 w61Var, boolean z2) {
        int iF;
        int iA;
        if (z2) {
            iF = w61Var.e();
            iA = w61Var.j();
        } else {
            iF = w61Var.f();
            iA = w61Var.a();
        }
        return iA + iF;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01dd  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r13 != '.') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00d5, code lost:
    
        r5 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long z(java.lang.String r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t03.z(java.lang.String, int, int):long");
    }

    public abstract Object L(Intent intent, int i2);

    public final void R(SQLiteConnection sQLiteConnection) {
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pz1.k(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((ea2) this).J.b + "')");
    }

    public abstract Intent r(MainActivity mainActivity, Cloneable cloneable);

    public o3 v(MainActivity mainActivity, Cloneable cloneable) {
        return null;
    }

    public void A(CharSequence charSequence) {
    }

    public void B(en enVar) {
    }
}
