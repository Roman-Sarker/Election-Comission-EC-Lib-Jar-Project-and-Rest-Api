/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import testsoap.EcApi;
import testsoap.TestSoap;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ecWebservice", urlPatterns = {"/ecWebservice"})
public class ecWebservice extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ecWebservice</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ecWebservice at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        PrintWriter out = response.getWriter();
                
        String dob = "1984-01-06";
        String nid = "3733034478";
        String rThm = "b4H+khOUYq1q0kPyrvpXgugHbtB4nCwn5fnShyGFfSUhDPdLsbOnKACVAlrgCjbcvUAjjpfptSY0cLi+O3R5Rhf7K42zN0fy9/CCCc3ZrFPZ/+LRt9LFQxKhhRdYDkpwHgPxGabe2zlY5ju10yz2a+6bgfHJxzkBTSyqckri4kndr2/Hdz11bkvugq+ndxDM2jzYDtaVIp+ds4yqIdFM+bdRKBa5CHuyTlELcbv2jd/XeIhdTK5Ti0XpDPNmSRCaxDWiQI7kH/Bgd2LCPE4qwKTSOg7yb/yuFCa54f8D12oLIwPpzYBf2VTBS29EggRSMLHhhDnbC/zLzMXEbQSt2YEK7Ztrn2jDIgVBrqLDS5uoab27hyrwilvF2AoseW7xd/w7b6hgkKaRAc+ftoGDiy9TP6WuMdSZ+vCrY/PHUdgMWyI1G6T+sHbDC179p4fXogkXPgrv11I1dV3ep0Ba/IjnGqn9bABYhfrIn82tqiydFfFifG9rknJlAMkOJTjZWc3Sv+BIUQ14comOclURHDSBEtJscawNsv0LbR5/rDAADBua3xcfiq25XdndmrwhuAo2dLcYtfayxWCYsM3hXuvMyNQhnEv/HwYZwe8vqoCYdw4ZnlClWqITpTKWYc+HCAnLybCJgHiPg97y1eJoX1RhIMHHFf8pmzdkJPETrPkATZbQmJqtotkNNiGdO5hbHSFTOXQRHoIidJ6Q9AMtgSM+JpfDTMEhksAAbqPvPoU45wt4dXPcw9bX1XOP6gODwHkw76AnDU1bf5OLkK0JUVwWlafjrMXWEdWg/rP86Kj7i+MmBVdSJjrohqXGbCeifRHzPAxRuLwCp6GWqBWnwZajzDo9FE46/accYt28Xfmp/DUWn6wrDjEz5zZpabN1JdIpEir7ttyBNoQ+u6KJGuPx6mXGgJdSEb04hSWmm6s5RLgDn3+5lgkxmlyhlb8K7Y8LkYn386sZbtxwaElEwFdTSqlqMgpdv72ezqg9LMCSDnbRYCtrgWB4cKmE1Im61jz6DNeiZleNgReukldqO6FmKG672wCwj8/Psd/N0KNIMhaxoM5d8HelPueDnghK88Tqj9Yx7z9T/DJ3QnWH97MVaIE+4w408E3dFf4QWAX0cu1K7l5ggGCdNFTqBxrfRW7yReSUDgQsF955KhLSdQ7+UTkvyfZZyBtL2IQEBBJW/AC/t1Z5VnsG/LRfe6itlY7qSFRnchP3lR1P3b+NdNFsmb12OaEpI9/ew5AUzKf1Ev2DSPr2HqjV8POhcoVvLhYxQ29eI3YyHMjVlXSTdOzaWPlm+UPAOdZXh4dNX3C1ZADLBaQXE+/ke6LaxFGMQuYEfVpX2Q0BMZrKpS+11KXlwUeYQxUaetVbPswHa37wFFLXKVD5aVb8UauUHp/VuztAvCOmeHwZOxIEn7mm5obu4pkjaQJCIHlMqVevgSEtheLiP6NT5VW0egpR1Z5jM4BtavNwomPRDrkbiKRBxoLrFa5/5mEDwWnAX8Avxqabr1/FtlJ6bL7n+zFLLRc/EhE1+JvQP7Qd6yJYe1apLmKj/3ercNL19tYeBrxA7dAAXPqiKWz6Rknr2SG935UcIUhMGWpw1DpjBl1DrAVJQqJ4sG/riblHiyoRthf7ZvRrcLEAZQmuF7aGDbUOZrMazp50O9dQXMmKyzqDEAAw0941f8LD2OkPoVqtVWPpTquql8KtB5FedVu3lC1zCrdraTEDWR4AL8UoQ4CRjRz6Re1j+FofANlEj8s7mBXnrl5ChkzQYYZMAsnhOe7wBLzJZ/hcEbUO0sJRXvQbbjZ7/wvQ+ocyOpW6D7aaPdMzWHZlD1uM06d8DMhUxbCT2apu7ugAhVUBvik/Qm9VlhI7bQl8OLGpHKhGoHYjXqasCHpxIvpd4M/gbJlExI2NIrEDTFsQqWKuflNqi1CPfwmmBlZ/tpIcQWXzYKNZ0BJtmhbjvKq7DUqsLIs9u8CAeGnofUaWQw7kRQFmxE6FC2/9ci0OptBc72AdK04Cj0ZFxAx4vqtJ5Uy1Zexbb3aMoq7PGhf+qWqLhF7/05O4555HMzwaJOgm14E4U8njuvdHPhFIC54hCKgPXntk0+AqDTSj78BgWnp2TGd0tdK37jvsiX3Zl/LVlLjxdRIiwe7AoDDMNMZEr6N0jDSKnDpAvl8sNem8+fUoqFMTEWnNUJrt2HAz29rMxuIlXeaxKqRL/9LGM8U9Vp+Vjy4YAVMK7I9qg1qPDi9jPxUCUO9oUPzeXrHbR74TCiUwg3GE0lpM1h69uw47EBXsGX4QTwa1qi00cAXtyyyLzJ//9m9Lny92+go9SkTr8KcdNdtbSpYNUHvGnjzONbDqJ3pCTHaM2f/6xM35jVqOFIEyQFuRUfngDsTEd9YTnU77kpti2YQt2aQ0Y6YMDQq20o5hyg9Ed0dcvIlon61DqgZWi8xEnXi9c5jXKShZZ6NikEOb+GCl7eaUGbSp5qKKU5xpSK/DKlLwlaIvaKNIfHhVnx4lz+aktDejJqDIUsK0C0FLlPs6+dMegGD/kuL/foTP6fVyLF5DXncOvKhwMQDeOyadMSfOb/xOlvm6gJeaqKKWUda9CSG7HJ17piX2tHQZjngAFZ9MxXIjtLAH3lstwvrzklTx0xfG6/18UoVOSGrT/hjbzLAQvtKw854VkoBNc3pRnG1FzvOK5nLjydqlbAStmlLiasgxSgCvVbnxuKQkhPboyhOnkybGI/eqO5gpRi927dAwklcWTaQ/cPHSZ1mDH4Xx/wem0YIYRJHFx3txFsKl5ceNsfY66EkCF1eL9XlJP00IZfW8Wvl1+f/3xCxtOWWN5doZ9q55bmsQrggpAF92iZDMfU+TQ92rQF2w/6ua+m8usTK/NTXLKMjafExyiD90yU8NKKmCHfmDZNav/DVNH5otDzTfzAJz/+LFTyf1QGAjzkM+Bb+9C2AUypuSgoDnp2vXUMItPHm7cy+HaKa6QyDh/rX9mBOCbhj9VnoYre96t/DXfi167VAiNhbwAF0fEJisWIIssoLIyOetTzumLyfyhtr7feL/u8stcL9fEkt/rn/ys1tD3p+u8jmG7V5AzF4LdFSvQTk7/dl7+8+Ut0nufbLQQM2Sz/ZRi5YQBvMaSOFT9imGMM80QIkdUps2xhvC/ni1EY/zrIMMISht+K+ZpYV4WPNevFIfmVBSUs1Qrq4tR4avuLXsrO/jgQyKKqicb1PRmE/PbPzhqNqGTPQC90n91NbO4rLswhEfzTC3j30f0ywoqXbQpo80R5HLCkCx5HjLfCf6kFYtvH8ELhU8WS/KFGR/c8GMuz+vsJ3vesQ5SYw8VPi+M07OfsGWpGEO1/V/VOsktDNdHl2pPzq8o5tvWcBK0dItfuVae52RG56dPviJ5lyTpbhCCSl79BS2DnyqEAHRoc6B8C3jDFwJjt74hSynscGHq6iaWssGqdou/k3ZwTGT4Twfagg2aSdU3lzVzn3XTa+D/BucGHljvFpPuDZTgkWoDc97uZyqGgLP4MJ3yuiYMbPlbGqgILtUOOY5a4l5zVeCfN90PTR/rzsQjbE68CJRKLt9rsjaPdOIYb3Jc5SAK5Qtc5MIyvxSoUctCTioiYec8lkEwVHYwQXfjsjLD+wXlQ0ZPNOlWODfBKSwNWIWiBFVIEYbSAC5xuAsyv8EXju+eQvpNQZjASxBcGweeARweHc1Ncm0cANJtr9U/PGgqt0x9xSVmnKI3lS3vKkdog1PcHRPtjIS87kISPwE9Y6X/Ujd1PX+4W5PRe0svmxgZpNqe4ZSX9W+brjLLiiTrRpFgcMFZxQOOoVJjmCM5wTepsNdDdEet6RGHR7pfFbfG4sy0dY+vk6OPuRR+CANA2H4Sgxfzs5yUDBraSd3wiSFIVYkBBZJecxpdgXHfgArtESE4KEgDZE2kkPkstxEfqInM1qW9H64yOAHLqx7zLyaaZwuiAcym/UVCYYzYgKtwDtD2tidzCnNNL2XlKt4rKtbVVqsbVPHVPPGvZL8cYbMEcSmnJOXgyRyyNWNmOyVCVSS01ehJP/sHYyEgxJtn+l410+F5CwBdt16POKxdRniwShsyRocPy8DhbmibR4CGHpU5EelvomAXhvkwXnh+8XlruETiTEU9NePZF/0H9u8u2WskZbIJYJUz4hkRlforiyATiM6DBrQcX9XeBWMr8YWZx5/tcbPVjREfDz0CsACjM8N3E7HnDHhetMfq+gtpjB5tJmtpqrlQzrzu8CRO3Pp7uAx4QbrZxaX/Zd9y8WnciylSWtFGJLUwc3O2pUWV680szsn5yZFBSiXKtsHqcP+tpmtVlAdiF73NaW67N+qE9O6XKa2RmuovekXJUJ+D8Kk+FFcYaBBbnOyfFxBogAlfAqyEzdr8SUv7mtKDCDpAwbKQQmE4b0jkNYHKclnlrOfma5BAow6HuRaWY6kWK9r2WV17moCPLi292RcgdKIBi0FTxl9+/ioT/8aaL8ODO/8BCkYhjFMdL5Nrudt5TYytYFrnsSwWRZWgbWOzc9MDSOFP7L7kpxjk6puPKO+hVHqSyWQnoxbXhgqVVsVJbi/lXb1sYs9dAwdQEMMWaIb+wYUAzXR8Sp1PO5iM1GXvVvcO66U8llmowmVLnJYm1ArcJCFbE67r/3eSH1bdbpqovb/jiDrQrIHiJThZAcakKZqq6GBNGZqC9NWP4E3KFkLTKbfwO9sq57FBf1lDmmM1lZXS/clO7p391AJy8/AMKD/n4Gd2N1+TkLLSgS4L5kDNaXXGU1qId6Tzry9ENod9xLgMW0dYo2GjhTK0lrvK73dlqySHdb68Uga3u3Zyls7hr8kOFROSuNbGbtsOmGELGHQfoPoOCSEjCjGIfTrffLXm87lM9qRFNAwaQHJoN4WsyRtBGSyhKu9BFNhT0dnyQ70YilE/G622f0NRutkMBcLpYf8Q29QBhaaqwQn1SI3WCc+9I0Rg8t1f2kvN+FanKc3jT0E1m1YVZ2Jph0C3zQt6tAQXmD7OUwseJNdKkBzUY3VQ4lTgICxhU6GJxPzlRCzoSWEmpMv2VfmQORvKmFO5Suldg42OT0Y9HVtyKpHC0RIQBy6dJOfn/+xDHFX5kUzkWg34oX6tB8BoO8r6+Z5c2N0QGWo71rxVx51d4scP4ghQTHJ2MqY6qgee4qJsf8o1Bb/RbVMXdpja103XiKVBGKSo8WK4vud341VlxrQFOiNTicrjRrF0EbCoFK+LGh5BD1SHwFoLdQZLAV4sbvZEbf4COVeOJlHsX4zWnmYgtHSR0k30IyDxx8gA7YF/H7Hk5IPuS2wzhDf6wJWRWhAbgF/4sjaZjbsFX89VUiOs9buBLiG7+/qNiWP5akWoGXnqRwYw4X5nv3PjmfpWzKHxoBegS7PDbEjJjWxwJN9NfSh08roJyl6XRrzlwUt4op41+CUWf5zvpr1lh0FCI9Iqen4HFRlpI2IIrfluzkwxgv4C+uf1Vn5SVb4PcIjlvY/3YqswWF5fp4rZYkEtiCQ5TvJPH5M3xCYfaytJYeUvuUAJCX8ekUFD+Cfe9YyFLrObs/hum4BinuJZqP+yg1AcSCMRLkDU9yRQ6gMQwQIwq52xtYW4EfIjPwkETki8PRkMWVdZzyo2+KlRSG+G6xNKm19BulJYnLGi2t7HlBL7362bzq6MNUUxbl+AIDcjvl7o0yES60h9n/Ko5MqiYMaO/7hFJk4HpoQbJaa42xIrtSOKz9FHWMJHudEuWhHFw6soeKUmubpzgeKDb77BuwvAt0z/i5YhP2rKX61qLNAaHnYFt1P3cUeFGkpIwRUQqz0IHVZvtNeufWZdzrDOBNsLvIS+7m9aMgzrI7Go9Lv2hr5UbfRej+H0M9k/HiLwQq5Amct03ALisMh5xltJ8me1hQLNIw60x+QCsy2hg6gthaQkQf98BVxQjUEyAA8Pg2lmoBFPqO/Ys8s9GSpqQrM8LY/xH8ZAG1lcb6k7ZzGsk4/1YLw7uFd4YLAcjg/JAWVP+3n5N2bKDmDUsMA+hPT/I5ccDMmD/PP4Gn1GQxFNn15VkPD1d/wC5Zk6NPjDiS3R5YqirF6tvWaMOj2TF2EeBVu2ImPCvWcMpdozv1fW3S3w8J5Gysh+y8CgELq9pe8erUTWANxI8Qhz0lHdTwmp1C+rBvZ7DBYlLwH2He+RtDo826JwIeZrFwtVNPJ0iBGeP1lNzbZj7Ahzne/GH51DGfNVMJ+fj7a8Dgq7q1LjZrxzvfe71ojhBe8rASlOQ0gWmDMbOkHwus7QnDj87fjYcYEmRQn4atZuS9TTA/dGnVOfAdn4xJd4rScBvNrY/s86Wt+I8pob0NyKbQ5XGg+BZ+2bNKY1qSwyZROlOF4942ryE/y1ZfuHWJwL2yPdhFcIB+oE5DRFtwLeERVuGzMAVXZld/drPBrBEyXTlcpEHHKq3JWwLIgpwmnqBiWTIEdTnqz74pRAS1C0XAjgALj6bHo7Q/aL/fyBGAQTfEvkuUkB678jxRIZ0/GB+UfOK+XnDjChLGJL8lEB1cfKGLtRPyL7qnsVNuFJXqHy7lUGivxxzpapexP5FG2fBhT3aUxwYGNlg4V9lTzdQowGg1c0Q+2PHy/EvmVnrwtjGU1XCDK+YTs+g+IZQ1Ajk72HereZu8by1soaxdhiA/mCdqsVjumcVbYWZgwWEJuGAmbJ5o/CwsghxQwraQ1FpYsEaIMicqSNYGPpnRnUiovd2yC7wUWozYLzLn0vNH4O8zc9RVPAYOWCvirJhyO+T/N2aLLWzKGZQNiaDN91eCLItYbLmAtDrITatmu6YM5HgITmSxmiOS9IhkivHPUJUyFKaSaMcTlGWzHtCZXic/dNsfnkY+YQgS77+Jh+BqxQxdHpOAVSXN3hN3Yae8MbkJ+fMYJeQn7S7SF5qdDLnbvx7pAIR3Em+F9yGYei0w9++7KZU1uviB/mtWb/oScA4r/+E9EtL09Iggrt1XI0xYGoO9dxT7DAVnUlfAO1x6CV65uBnun5zgcjv9kiHDy3cY9p7irDac7p5E+sRwGBERlgLSxEtEO8ujAeRbvEoTkEDyOQu7wE5xf/ZuiYuzI8gB8/Xt/ad1Kp81rauj7gxKWJfkxuvRY/ymyyMqIBWped5MIJAj7hPfr4s2Ky6QOD7bkRXlychXLVLJ/aeC039PKfyHVOP6hPHPC6JI2rNzCwNXaknMjIuMRdV/WEDKnWLiipuQNTTyCDyD2tWoMqPEeDLePlDcW3YYNWYToc+n8MHfZNL4VUKu12D+rDaaqYkGoYxKtJpwUy/MpumGAtN4FE79V0I/RVc5LwI6g/lsqDTuLnlVuKtB+go8VRsAnWVEyMacjgCzLlsMkxMik5/WvLGwpSYad03S+dbK7GmQIDUs+5L1WnfEdEyOxGEUw9f4/Eg4snaK6dhF/cFz3rJyCuMTfSHSmvlHSQ2y6a4D8oKLS3N11xTT2AHt20p6nHTTh9pDYe2iCN9E9P3FRfsi9r9uNGnaqBJlt81WzXrBpEQLOKeIAGh2D7ncDRH4hDYk28iqNnkWQxngY8x0JfGz+ayISr4J5LyD4wet3AiPRHwmn8waJL2sx2U6BBVjdSp5YuIJxwuFhGirMDrsBkxfsZwFV/DP62rBETEhqu4mEVQVmixl9YrDRJZYZy+eZVvOnP8uHZ0ReZw07Tk58geHimwRV0WXjvsXLLtSOxVEhtATHCi3Y7jU4lH6LFMMJTMSyzMJOq59+vQ72qW4GkwMJTWwg5eHP+xTPbkRZEJHSp7K9hOlgpHQUU7p3nftGoHTVT99POi9maY6V4AgiZi0jitxVS73W4JPUytsYdtevaabyM3U61TM9GunYQ33uqykdjRBHlCw4dmzzr3kXgcfyAC+YztUg77Ycp88YTXZPYUhd67Bh0JciQ37OvRj0xXi69tzK6UQli/i8Du25dkeVAJ+frrJg/G/94OX8j7EtivdJKUl0Hp2d5Mg48kXDKUgOBn3dIsqVstnAzaaH9i3a4F3PJVTgjXjTlWuKQmsu35h+vINW1dSFbDn4cSPyMRhR46HTLISY/bXcMzvJ8x0C5HmtKwVzONqc6KkikF5Zl3CrgTSf2CrV+s/2XdJf1MhFnWMabxWn36UIhM8w3TSH7MbiwUiz+eDEPMd1e5wUKcFsZJltXqeBhCEaGr1Ih9UbnQvH9HYpPf3ftIuGauPBRePNK1sDMLXPWIfR6QnK0P1vOAoLv7LyJnK+kcvW1xu9MOzljpNc8PowrC15kPiopDEse6GGsDjFOLYQn/weANBK1nx+xSRNkf+bjscWM+D0atbnHgwFRdMG9rYrJR83wc1JEPQSqLQnIdpPair1wSHfUz4E7JeYpHa01jR18KCL/BLTxNKQYVDkG+HZphXDRzTbPA4qmiBgtH15RhCiqN9MrW1l96X+v0AV5BeWeUMqJR23JkOmBQGu/fT2wNWHyoIpgZPgo5lo6FPEQQadffNonvJtTYMgswtox+vitGwgoAdm+gMMDxJWUKmtxCavZadsVMOgoEB9B/uNJtcQJOodj4CdzO0qOykl162yAZWyLTMoZWKm4rs7dLr+9ZmpLB34MA9DW671fDUgDRPQn5nbtMQCLM9BTeWjsYgkJ8bVyDucgtNJstCqn06h1Bb5Rm+zyVIGfzaynjO55PbDG+Pi7yZS2A8cvNn2zbDp1xksMORM8+22sA+RtDOKO+M/aemr0rS9qM1gVd7xRGEK6MQ9PR8nqaKFXGRCvsPapOYcSNT/9HPkSDVpHf6H+CmfXSZ0UWx1TUKwiHhqhWO6vQljh26cMo+iwBPBrq958i75akmfoZGuaZppXKW7V8sYoPm/djmh/C8MmrTRpLgL+qSQGAMN6tGoWHqPvhpCBPtzJRlS/9FG/0DVlE7qTZK60xwkBEKUzgguuhsDn473nORSwB//pAXeWBBO6c51MahydzTx+ogjkdXJ3bI8s9mw4ePCsyq6wgg+mP/VfVZH8zgIGhuowkKeSsIRT6Cbfx/YE5ZMw37vpbWHSJUC2StuufJnothjGf1dz1Krljj0CAiXyT9+esL90p9os8pow7kPPLrYnWJTmAnyALJIsxFI0aN3r2dEGUP70tLQ/kcN7ov0RMTKkOzs7KZvJbFd7i8Y9YdcETLzYhzCuDOrkiTC53vWpYIX8sJ5C//ECcLELjr6kIJoCsJ6ZER0KWmOLcUb+4yhgHsrnqLOBV4fTiLYhApZYJsZhjhGBfV11IaqqX+P/JHfhYXe+bXTpcnfiMuV0jGjfOvPQ7WQhjTrCFFHA04Hdb+y/9sdkIfGV91W7O1vnuYJ48iK6sTR0XSEsCEwsiKX7K5VYJBy3azNxp/uL7D56M5ZBqKNy7G5mlFrlskh6cUvFVrg/ZUXJsrm0p+Y3hZsYCsMOKM1byjj3GgVKc31xTSQB1KndwQ64YlmLUjms7PYz9BqwAkLcUnrZl/AcdI/yCR6PQH9m3749/R/GUOm7cf9TUrNeII46Q8LHQCZKaQjPrX3/853gAdkErfgD3sJXXyhNOY6mLprO4lY+NH1n+ugqpJOwZ43iF4XcCTYHMAxhDbglrlhkQXJ2kE+m2cafLvnbFJMNhy4pw+AhpN0t1XrtOtQqiOMDOy9gXsSOiDwrxx/lOn43ORSZTKrInUICCmGJJGQ0+yhxQgv7+szjx8qSxJeZItHs5yLYTniwc5kYbrD8lMhxnlrNstOPPkaZL4OgMweGYwq7qpBBJgW/N4IWC6Ad14SoNEf9WL4nyZuOXpI2ZgU1gPwmBWPHnZ7nXDUdZgN/88ZALWpQMJhMUj7E0EvugYsl044D3ncEkxRN3rejs48gKlQWlzIjplRiVZulsQ2HnicCXFdds9hKUVN9bWRbqWz03LmVOFz0xvleMs0u+hOOtkBpw6495yoALbemqaf2ZYKwtWwNOGwro1zaKCzOklwfTF45WYj60jYTVDWXu293Q9OTqc0bJDQvmexhiAX146Pz7zC13ZCJrGfcGnVtdT93gwRqOqIHRTGchw1D2VTi3YJCpupcHY0yjC6QhJuoGuxIOdu3SEeUyzn8KZ5DsjRfzEVFQ8yrvALFdfWMNUMYIt+aXgQWPiemWH7TE4n8hxu/3xn9t16yBfLVYIg5O6fktvfZl9u8MwNuX4jYjnrd+pF3JRWuUUbagsZMN7lBdkZalH45YaHc+hoPXsCepr1N7ujZVK6ppXecgBmaWPozbtKfEj+5zihWY5rNYPOkfq5HtNfKiDbs7SdUJn6oGh1UOXTnkmHJq7yJqjD3TW957n0ZztWfHZ3Yw9XCUZBg9655W+PNlFtOAI/kTEwYol63y7Xbv7F7nFoKlYHLiSY1IvJ0miM7wSl7lRz533qNlwcF50xLjnOP8dZqwZBYXXvJMllYMS+QNHvzLa25yCBWyRu0XsWSUH7nSunZ6Jbl8GhsewGRSZQDKeycBxgpDEiM8PysaNGVSK8YCSphfQEY4Nm5vH/wfUKFmltRKM5lpAwqrP0IHxqhxothuHVpoLEBeU+hPQGQJFVOzqrXwdYFPSLMcEswZI8N8KJUoEBHfWF0KLCeTv5fyiA3T7UtZrEUDUVe0ct1q6XgAYaQKEFzzC0wHQ+TRNOeLfvpUDFBdmN/XNJMX8OQsZcC3ivNxLATY4rpf7YquC+i0JtzEQ51b0B7s1sWJMEX94VJRyTjV+ik7tHU0cnMQj/NpoP1yPVV54Oc4rQ6OjHvaFysvYQRjiZ6KhbD4u6SNnWyedhRW1wSirnJT38rYosHKP+iL/R8kyE650Xw9CxYslxmq85mvznnsTMJa02cmKCf4wd+wbqcQ8DtCSXtH+H0XyaZNlvTDkgy83c2NVEP1XbQJ0rOCjXwXR0NuZyAklmhkKLLNwv25gMUkmQjcZd9YG0OdaIK/ApAQkginjFHQfLxFCBB1Ip9ju/2tjncykdPRYFonnXEvYXj/lQoh4kebnfeNguepiotgqsKqN2+MiJFgWoqLkC7L3uPy43YidLWb+7Y9Rj8QnWr8ZxU54vTqEk09e7PBy5cjfYK9tHR6nHy+2nvpchy9kYrO5KcBm1uiOfnIMqkz+wlp6OPaXtFK56pLL0Pc6G/5dPv2ulrdav/bh9kbtFMvqD3tY5q44zFbJlDk3+EqVsOPO4n/4hDpn18gLZdI4qP7RcRweijVY78Kj5mZd2xnSfXNlScE5JWbgLTOEEGUObMvk1r9txsyXnMf37kUdrXHD1QWT/JdmXPOLngJbOqMoirzbWiMSHthlMfJ6AVtNCd8IM1hpXlChnpwhuKYPn6QewCKITj0NLbWWUmnCpEgeu5f8+bOTtcP1HLbxva0FRGRs1eIqWbKYsk8kYJTKf1O97R3xm/tGDAwFfoH9Giz0/Xp/zF/SelZ/dIePm56EjfBI5MH1VvwzFnqWoGIahBiZOObebr4t+fSWClInJLw9Xome9waKjtmFaSu9r0/QYjmSC7neGmznPCq8Og7xb5sBSxQl9l+qK1+BJ1glQht2a0qZX4bSFs+GasVjh1jwr8Qqw2OQ7A+lTYqH4fZ6HIpqVvrKFFlwAOUidh0NNgxC0gG9qrY8a3FkJqsjB1nYGMqgCr4xz5chR6C4sft4t62W7GgUCTG1FGPrXq05MPxUFpn43Mo6PZVOTAUeRko8jEJPVbrMV6OjaA75GcBKupwL1BZy72YTdbYthVeTDH8QvVl8k1EkmY7yZtUuEIIM2TpA5++m10j8KyUwgDQM+qwJ3M3stg4HG3y4Km6Q1qPP7C/7AEtm8ycJULiCuVlYUdM8D682iPaHq7P6sMerbHHGOBENunIheZjXNYK+FLVxAgym9a09NFDQJRlu+RkdvlCyS0hAg9oca+qJU59TJnZnyE6zRHJP/UCeLCYyHV0ZmmvqnoM+NSicqImNQXUK2usnVrEruJiR6eV/HBwxw/E2dkRzhLaDWaWe5tXGi9ivGehfd9QE8jn5pcS+kplpV8FnfdXXt+xyGnntFKunLJEhScOFiDaCu75qGe9XaJyVgBPTVW/MEwaKuXxpkA/Rq7EvNZXAmtyLcTMfFGw3YZl+odomy2Sh70S1y/VYTQO2wtg78S9Vlke0nL/6mFGtOTZ0QkBvPci1nDcApGTTfMUVdln2tOtx3T40EPDF3axc6Owty6HAGReZxsBaER61pzMaOSWDNMULcDG9cveI3EycECFgmevYCDhVrZ9hoYSMwxOtG/jWhBglIv5zA+sQsfWUCKH99UfMdcfM0RVRw7dpCfYWYo302mMER3D7ZolaWdv/2WMo6/8LKV2FTcLKoQAOMZ20NFmNVcVwni5PplBcayxJm5C2AGBIGiEChuSksddlnTv0NmMlbVQWe6ppb0idirTiAHaAelMfO/0MJ+vPv2OFiw3xU84BHPg6vImG+05X+QxwxjBfSX/MD3hhW+iMGABZAmMmtDDnuk+LPehiJTY1KcaFvX+eDjxpS7NneGnymPG79yFLMNkjoaVK6oa8Kw6pLv5Tzl/9oLSPY0h3eJz2l7ifID6wqMBWwZkHn2ma8gZsndFBLql715JcYVroCQfk1clmjPV1EmwYXKfXFL8mUyRR3wX10qHn7XE0QR9ZOADVDupBhvlDD6dne16WLiYcS4Qxpgubxi/JExVzHjdmSXq+OABJCbbUuGfW8hHzlc7Xr2AuwW5To9a6DuDpkTsUCAbM1t8gMsnXqEQfJi3gi2EnwI48B1d+zmNalXk2xtgHn9Bj/6CTRIE1LLd4mVEstIbOJpeien2UsUymIAb2ShgjEys95EyboBATTJVLCzOAFi94qw0NuyRYRULhCYHQs3KzaVHuy4QLb9AZuS/E5Oe2yQxlXpR3ujco76emBYZdo+WQ8BFrx+hy/XV+rMO4FtMl4v1bty50d16PAR4kr+byXq88id4VWrB6Ny6wYW2M4EWiluUaigwkPEyCnEOnu5VclLM45CkMVNxIjaMzxGaZp96mrlTgYZ7rQ5yHuwQgTnA6cJtYWZTDkTsYlOB/dBjngYOk2Xp4tyjQ5xI7L/NjLhQ9bD3Cpq+sII7EQE3F6ckVNcQUyVCa5RkOcFls5vu5q1vdNsZPNUM++loe54sbOa+3c3x1+oE6+aIgk4jzVjZ+49+Lw8fOYcEW4cGaMAbxhKXDA/yaeSDIZZTVf5VTpo7Y1Z/LGfuiywXu9dLGg/bhWM+OhsL2vZLpUufZ/2JYPhzjX5An810LHp88n0AXdDXh2TaoKhUjYwXJ3Aq4cOVAl5+c3SLEWWuCkRNDT91tKxTe3/7DHaiytI4i1U6TnKKVHHorbXIS4Xtx0PPSukGKjATrToJTBQrZOgVnJKeXdJ05m57zU6gFPBkt47GKcRzq2FtcacROYYOPASrHECMpqFDPZss2ohdASpdDWQFuJBBTRRtusZaIH7IBmyk40Dqdz0ciV7ubsF4vOO5xH8vEwhe5yJmGIg602KeT8g7IsCDBdLvCTnilCNm7LsgDe4jBXGlurR+slCdKD5FCox/jHDRnOPiIDeV9tTYJjkqkhNCEN0iSWLxkM9m8gkpy089wwwFRWAdniuccuf/XvS5UwiY7QMcL1AOz5VtHwZiVLBj89OO5JNPGQkX7vmw0JpZmlNan9cEGTesH2DP2xe9nn8JpqiDYalULxZLbUNGJcrxwFZxSZ5ZBdoY2W3Pm2KkL2wuEU7Yh2aNVUxbvh8L2zLMherNO10+F7ZakmZQbwRrl4G/B+NKXWFrVbAt/cRtMjO2QlB2TFl9IzwVeUYpBB80X5qcqFhKhLP2Pb1UrB/dgcrbBXeuRfrnLKet2t7ANOd5jz9wHRhEKageNGvh1E80T+w74IYeo0HsIYflMh6RTcmLbucJqf/V1nqmhLhSYnIFOicIasqvi8GYdjmSn/UbwjtOwB8iZTaucBpvN/DqBx+8uktmmCeylFoToeWh9XsLaLw1s49tNwla8Dr3ZdH/Iep35irXl9Yc+F/x14ysb1ERNUS92cdDRp0/QN/3W4VxOL+oHtgJ0vA2QEgkcY7yy2BIslfOKqe8wq7gP5GO0cpiuXY/PxS4hPJXCLI5GzP8AWgdssSoXQ/pNYm4XhCiO+3Hya93k7kCKKik8h7X3lUUUgvgH30GtRqktG/fWmlPt2CT2/LuaWoEAMmWYo52CQ1SAnPcTNc0KUHnHnZyDYTtr58dJvm+yrHl4CUwmXgEy3ORYRibBgcqu01pgN8N9iQwwlSmVMHB0fQBr0e/eXZ5GS063Sg3sKcEskh/OYXZ+y5pqBzDuqsV9rSOY0P5vsXGSO8cHQdjdL4G/8+LKq8ltGF2REzBMleZwNEeB2PNRkGD91tLT5KvnuI1bhfe7bV2TgcYeRfbwkZixt2B7hhgybjD+MhRpSGArhbJdCOTupsP7/nvovqqNybHzobHi1Tlsok665EFE97Y2q2j80wvv9z6y4fUc6hawD9Xt7XCDMMBTTR5EOFToakW5HtvAu/pNgZUiDNpo6CC8ffFXz7RXhJyC7chddNSVJYF5YStVnE5NXxDq5+wdBqvY1pcDd+hU1lhG8rCGWLybMjnG0hRDiBZ+SPxYNMP7PgdPAkgbjTzLK+/cUPtVTq+7+AU+xODUnx+JcHrCE9tjdJ5sqpyK3XXEbZztOMDQxDYYaFxXhtEC3EwLc85idBDSEKdNZqXJhWJC1d8ImI18AYdRZFkzPoH4BbNUZ5Mu3TeQ42oF1ZiFw7udB6l7o8t/Y3cInsDhco34FtNRd3PH6VxoQIFlsmP2vJmxp/yQCdgl+c/TZwuivrZYskwZ7SwJHJ1W0RxGjMMnd4TXX2aQIb+TxKe5IzLIBX5bQOphiLFRO9jbbycMQIKWI4kl1zymIEaquEWzQD4T2fPtVBPE8p44hFA0zr4/L/iHSRf3gOE/29ZEeq8Ajs2scFoRNDkXIPT/iVOliVedcvo0Jul1mkv7vZFj7YbHciioLJUpFydK1dg6x8Lmk7RzdOJd5DbkPnuW30k2PHFVDBealI8olFuEEWP0qCPpZ81Ex64nA56RbP1GAYPQuJ1TYiTnn50ziyr1Sgw1x9VThQZhZv4+2CfejhnGHlIWX8slZf1yrtmVSaU9iO4dDaZaifAjWTTrNAc/V3gggyO2YBnXBfm9JscNBH7uzdezjolU9KRJh171EmvdLnkBKKIc3HCp9QB32TS7eXBMy3T2DW0A/8MHOLGuSyn+6lbUtxfmo5ZtndZ8uGGl003tj5ix9RJKrdXNx8pibYgEwzPjXqzK+ylAdoxMdFt6H+36PEHQIo/ihP1ZbLje7NcLL9qWgg4sfMfTbv9U+9f98/Yjynw9TBKU57jcB2WaoB7UiGB7bJghDesAKEyc7Wv5wZpO4ecksfVnS52raq692eQoB9H4nNJaFVuz2/SIjA3WnExziq/9SWTr3/dceBjaCiyWrxN53J11h8pu30rHjuz+s+/Np6nLDRQsJKKpngkkHXyi6dmzxMehyhQzouRZbPCDhTzhDLymHMkOFbCepjumGk7Rrf2RGs/W5IF6hlo0dS3maCXfezoXeFzhZUoXvYddAXmo3DwWk3jfosHGcJI2lRJMlVQsCLup/q0vsQpDafiP/0UzcNXNvxLJcpVAjmU9GB2riOmHC4BORPk0gZRPkOoUhGsXlnfI9o72Ws0TCNE3ytM8j4D7XddBP5n6inVB7UyJoMiHqI2btarHq6bpwk3K8hy8B6XkJZSYLowkkmZ+wP7dQ2CbnA86ir6PQhDAKjOl82iP32sU9k64YEitVssR4nas3gNSAKwmTLu7CXDSxQcQRotIhquby4Jry5FlVBsLv3rhZfOi+W2A0z44mj7EriFqhsL7v3ZueqYseBsoDh4YXRSnVm7l3LQ1OKaUWnx9ZHTWaaQsN5XzceIa4baBcPhVk1zi4oq+P76nYvLWsCBCKJVAygjVSRmi8B/RJq1QkefjuLQtnwMqh4RHb+6kLUqNwm1WLZmH8/M7EgqAHo8Ew6bbYv2umINQtaLzIBWI+eNzbmXj5ZwlrFgpV041s5LqBvd9D4P1oGC9Xv9QOVH2AXl4/zoYp0UD+BqT68QgBAzDQfrNWffXs1BC8HoOUNqANcqfOOj73sxLlK+GdIIUZ7YQS8qviVSSIvMg+fwETX25A+ea3dVtGpWVWBVR7jDd7vfH0DeOItQaRf/8WG6k5hrN0LcFm5waT0gHVKJy11+hATfIc8IiDmgiiQQXyU1yNe0qqL2VYK8Edqzd7ng6KE4T2kGfYS/Ri6RmOrYqjY/VAgrbBgrQsAPwfijz17s4nB+o/TVOM0uP9UlTWpYUV2UfWO5xAvx0hpf2hgGKeRxx6YcAZ5OW8gbXFneIRjMgkD59dSBDffENdkxE7BgY8QIgOxg8F9nOqONMkFQPsvCafa4LHEjrAXc1+dw7Kd69u57hN+9KfvUM1S39bbtd6cwKfAE6MXT30lXHxW7IUOlcWmuRssA12kCdSsSmyzukubK1C8GGaOHpHUSAS0Z+K6O3ZM/US8iKwilyzOzI2Fge0HVMyciOlCYmgw56HI0U1/6GxpEMeSLqmXoov9s6HuuU6aTnhWF7TQhpZhQ1B+AL7zqtVwFgCAE8/XFruX4H9syuSgTThMoWuvqbvkyw=";
        String rInd = "";
        String lThm = "";
        String lInd = "";
        EcApi ecApi = new EcApi();
        String result = ecApi.fingersValidation(nid, dob, rThm, rInd, lThm, lInd);
        
        
        out.print("result = " + result);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Modal modal = new Modal();
        StringBuffer jb = new StringBuffer();
        String line = null;
        
        try {  // Exception return
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
            System.out.println("Request parsing error.");
            modal.setFlag("E");
            modal.setMessage("Request parsing error.");
        }
        
        String dob = "", nid = "";
        String rThm = "",rInd = "",  lThm = "", lInd = "";
        String rMid = "", rRin = "", rLit = "", lMid = "", lRin = "", lLit = "";
        
 // Receive json data
        String getAllData = "NO";
        try {
            JSONParser jsonParser = new JSONParser();
            org.json.simple.JSONObject jsonObject = null;
            jsonObject = (org.json.simple.JSONObject) jsonParser.parse(jb.toString()); //HTTP.toJSONObject(jb.toString());
            //  System.out.println("Simple String using jsonparser: " + jsonObject.toString());
            //temp,amount,user_id,create_by,pAcId,pOperationType,pLogId,pSessionId,pCustType,pDeviceId 
    //System.out.println("jsonObject = " + jsonObject.toString());
            dob = (String) jsonObject.get("dob");
            nid = (String) jsonObject.get("nidNo");
            rThm = (String) jsonObject.get("rThump");
            rInd = (String) jsonObject.get("rIndex");
            lThm = (String) jsonObject.get("lThump");
            lInd = (String) jsonObject.get("lIndex");
            
            System.out.println("dob is "+dob);
            System.out.println("nid is "+nid);
            System.out.println("rThm is "+rThm);
            System.out.println("rInd is "+rInd);
            System.out.println("lThm is "+lThm);
            System.out.println("lInd is "+lInd);
            
// Check all value successfully receive or not
            if (dob.equals("") || nid.equals("")) {
                modal.setFlag("E");
                modal.setMessage("Please provide NID and DOB.");
            }else{
                if(rThm.equals("") && rInd.equals("") && lThm.equals("") && lInd.equals("")){
                    modal.setFlag("E");
                    modal.setMessage("Please provide at lest one finger print.");
                }else{
                    getAllData = "YES";
                }
            }

        } catch (ParseException ex) {
           getAllData = "NO";
           modal.setFlag("E");
           modal.setMessage(ex.toString());
           System.out.println("Exception raised to parse and check request data.");
        }
        
// Calling matching Method after checking requst data.
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        JSONObject json = new JSONObject();
        
        if(getAllData.equals("YES")){  // If YES then main process will be start.
            // Calling EC API
            try {
                EcApi ecApi = new EcApi();
                String vResult = ecApi.fingersValidation(nid,dob,rThm,rInd,lThm,lInd); // Calling Method.
                    
                if(vResult.equals("Y")){
                    modal.setFlag("Y");
                    modal.setMessage("Finger Print Matched.");
                }else{
                    modal.setFlag("N");
                    modal.setMessage("Finger print does not matched.");
                }
                
            } catch (Exception e) {
                    System.out.println("Exception to calling 'EcApi' class calling.");
                    modal.setFlag("E");
                    modal.setMessage(e.toString());
            }
        }
// Make json string with result value.
            Map<String, Object> map = new HashMap<String, Object>();
                map.put("flag", modal.getFlag());
                map.put("Message", modal.getMessage());
                list.add(map);
                json.put("Middleware Response", list);
                
// Json Response
          response.addHeader("Access-Control-Allow-Headers", "Content-Type");
          response.addHeader("Access-Control-Allow-Origin", "*");
          response.setContentType("application/json");
          response.setCharacterEncoding("UTF-8");
          response.getWriter().print(json.toString());
          response.getWriter().flush();
              
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
