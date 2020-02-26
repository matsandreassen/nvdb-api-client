/*
 * Copyright (c) 2015-2017, Statens vegvesen
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package no.vegvesen.nvdbapi.client.gson;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GsonUtilTest {

    @Test
    public void testGetStringMember() {
        JsonObject e = JsonParser.parseString("{\"id\":81456352,\"type\":{\"id\":105,\"navn\":\"Fartsgrense\"},\"versjon\":{\"id\":3,\"startdato\":\"2010-02-02\",\"segment\":{\"startdato\":\"2014-09-01\",\"enddato\":\"2019-09-01\"}},\"egenskaper\":[{\"id\":2021,\"navn\":\"Fartsgrense\",\"type\":\"heltall\",\"verdi\":80,\"enumId\":2738}],\"lokasjon\":{\"segmented\":true,\"kommuner\":[631],\"fylker\":[6],\"regioner\":[2],\"vegavdeling\":[6],\"politidistrikt\":[9],\"geometri\":\"MULTILINESTRING ((196389.1 6634998, 196385.1 6635005.4, 196377.1 6635017.7, 196370.4 6635028.8, 196363 6635040, 196357.6 6635048.2, 196343.6 6635073.1, 196331.3 6635091.5, 196320.2 6635107.4, 196307.6 6635127.4, 196297.2 6635143.3, 196292 6635151.1, 196286.3 6635161.2, 196274.4 6635187.8, 196264.7 6635214.4, 196255.9 6635238.6, 196250.5 6635264.7, 196245.4 6635291.7, 196243.3 6635309, 196242.5 6635315.2, 196241.9 6635316.8, 196241.3 6635318, 196242.6 6635350.4, 196244.3 6635382.9, 196246.7 6635418.6, 196249.3 6635453, 196253.1 6635479.6, 196254.9 6635495.9, 196256.2 6635514.9, 196258.4 6635563, 196260 6635604.1, 196260.1 6635611.4, 196260.4 6635640.3, 196260.3 6635669.9, 196259.4 6635697, 196259 6635712.9, 196255.9 6635743.5, 196251.5 6635769.2, 196245.7 6635797, 196241.8 6635828.4, 196238.1 6635847.7, 196232.8 6635873.2, 196230 6635897.5, 196227.7 6635916.4, 196227.7 6635917.3, 196227.6 6635926.5, 196226.6 6635944.4, 196226.3 6635953.5, 196227.5 6635980.5, 196230.5 6636010.9, 196236.6 6636042, 196243.4 6636069.9, 196250.2 6636098.8, 196257.2 6636127.6, 196263.2 6636155.4, 196269.7 6636183.7, 196276.8 6636212.7, 196282.5 6636241.8, 196289.5 6636271.2, 196292.6 6636283.9, 196296.6 6636299.9, 196303 6636325.6, 196309.8 6636353.1, 196316.3 6636377.3, 196323.9 6636406.2, 196330.6 6636440.6, 196337.6 6636472.2, 196344.5 6636505, 196349.2 6636539.4, 196353.5 6636573.6, 196358 6636609.2, 196364.1 6636647.5, 196370.6 6636683.5, 196379.3 6636718.9, 196390.6 6636753.6, 196402.8 6636785.5, 196413.3 6636815.6, 196425.8 6636841.1, 196436.6 6636863.7, 196438.1 6636866.7, 196447.6 6636884.5, 196454.3 6636898.3, 196465.3 6636924.8, 196475.3 6636953.1, 196485 6636981.1, 196495.2 6637009, 196499.3 6637029.4, 196503.5 6637058.7, 196505.2 6637087.6, 196505.3 6637105.6, 196506.2 6637126.5, 196506.6 6637140.2, 196506.8 6637169.7, 196504.7 6637199.1, 196502.9 6637228.2, 196501.3 6637243, 196500.3 6637272.9, 196500.2 6637289.7, 196499.4 6637312.7, 196496.9 6637339, 196490.2 6637367.4, 196482.2 6637395.6, 196481.3 6637396.6, 196479 6637403, 196466.5 6637428.2, 196452.5 6637453.4, 196446.9 6637461.3, 196445.9 6637462.7, 196444.9 6637464, 196436 6637476.6, 196420 6637496.9, 196409.4 6637509.3, 196394.8 6637529.1, 196383.8 6637547.2, 196383.3 6637548.1, 196374.5 6637567.2, 196368 6637586.3, 196362.6 6637604.4, 196357.6 6637620.7, 196354.5 6637634.7, 196351.6 6637653.6, 196349.1 6637670.4, 196348.9 6637683, 196349.9 6637704.1, 196352.8 6637729.8, 196357 6637754.5, 196365.9 6637784.4, 196372.2 6637801.6, 196377.5 6637818, 196383.3 6637838.5, 196389.4 6637858.2, 196391.2 6637872, 196392.7 6637883, 196394.5 6637906.6, 196393.8 6637929.2, 196392.8 6637952.2, 196390.2 6637973.8, 196387.9 6637988.7, 196384.8 6638008.4, 196382.7 6638028.3, 196382.6 6638048.1, 196381.5 6638065.8, 196382 6638086.1, 196384.4 6638107.9, 196388.4 6638132.1, 196393 6638155.6, 196398.9 6638173.3, 196406.5 6638194.3, 196414.9 6638214.1, 196422.5 6638233.7, 196428.7 6638252.1, 196433.7 6638272.4, 196437.9 6638292.1, 196442 6638305.9, 196443.8 6638321.1, 196445.4 6638342.9, 196446.5 6638363, 196447.4 6638381.3, 196448.5 6638397.6, 196447.2 6638409.8, 196445.5 6638420.8, 196444.1 6638429.9, 196430.1 6638452.8, 196420.6 6638465.4, 196410 6638478.9, 196393.7 6638496.7, 196381.3 6638515.8, 196375.5 6638524.4, 196368.3 6638544.9, 196362.5 6638567.9, 196358.1 6638591.9, 196353.2 6638618.3, 196348.1 6638644.5, 196343.7 6638670.3, 196339.4 6638696.1, 196333.5 6638722.5, 196333.3 6638723.7, 196328.3 6638748, 196322.1 6638773.9, 196321.4 6638776.5, 196319.1 6638787.4, 196316.7 6638798.2, 196316.1 6638801.3, 196314.8 6638807.8, 196311.400024414 6638826.60009766, 196306.900024414 6638852.39990234, 196304.099975586 6638870.39990234, 196300.199951172 6638893, 196296.900024414 6638910.29980469, 196291.800048828 6638927.20019531, 196287.400024414 6638935.60009766, 196281.5 6638949.89990234, 196273.099975586 6638962.70019531, 196265.099975586 6638972.60009766, 196253.800048828 6638984.79980469, 196242.400024414 6638995.20019531, 196233.699951172 6639001.79980469, 196222 6639007.10009766, 196206.300048828 6639013.79980469, 196190.599975586 6639020.79980469, 196178 6639026.70019531, 196167.199951172 6639031.20019531, 196155.699951172 6639037.60009766, 196147.599975586 6639041.79980469, 196144 6639043.39990235, 196138.75 6639047.72021484, 196131.400024414 6639053.89990234, 196126.800048828 6639058.70019531, 196119.199951172 6639071.20019531, 196113.800048828 6639081, 196108.300048828 6639096.79980469, 196104.800048828 6639108, 196102.400024414 6639116.79980469, 196099.599975586 6639133, 196098.400024414 6639147.79980469, 196097.900024414 6639154.70019531, 196095.5 6639175.20019531, 196093.400024414 6639190.20019531, 196092 6639209.90039063, 196091.099975586 6639225.29980469, 196091.640014648 6639236.84960938, 196094.400024414 6639255.20019531, 196098.599975586 6639275.59960938, 196104.900024414 6639291.70019531, 196119.300048828 6639319.70019531, 196133 6639346.09960938, 196146.199951172 6639364.90039062, 196161.800048828 6639384.09960938, 196180.199951172 6639402.40039063, 196198.699951172 6639420.79980469, 196207.699951172 6639428.5, 196217.5 6639443.59960938, 196224.900024414 6639460.59960938, 196232 6639472.59960938, 196244.800048828 6639485.5, 196256.300048828 6639498.5, 196268.5 6639513.90039063, 196281.699951172 6639528.59960938, 196292.800048828 6639540.59960938, 196303.699951172 6639553.29980469, 196312.599975586 6639563.5, 196320.400024414 6639574.09960938, 196326.300048828 6639583.5, 196335.800048828 6639599.40039063, 196342 6639611.90039063, 196349 6639627.29980469, 196355 6639645.59960938, 196357.7 6639657.1, 196360.3 6639671.1, 196362.7 6639684.8, 196365.6 6639703.6, 196367.6 6639719.5, 196369.1 6639732.5, 196370.3 6639749.8, 196370.3 6639752, 196371.6 6639779.8, 196369.5 6639797.7, 196362.5 6639820, 196354.7 6639840.8, 196347.3 6639862.3, 196341.9 6639880.4, 196334.4 6639899.3, 196327.2 6639921.7, 196321.2 6639943.3, 196317.5 6639959.2, 196314.4 6639982.6, 196311.5 6640003.6, 196307.6 6640023.9, 196302.7 6640043.6, 196297.1 6640060.6, 196290.4 6640075.5, 196283.5 6640089.6, 196277 6640101.4, 196272.8 6640110.6, 196268.6 6640120.5, 196267.7 6640125, 196266.2 6640135, 196266.2 6640143, 196267.2 6640156.1, 196268.8 6640168.1, 196270.9 6640180.5, 196272.6 6640192.1, 196272.7 6640202.3, 196272.4629380733 6640216.227388193), (196729.81008317033 6633009.4624330755, 196729.330078125 6633010.53881836, 196720.924804688 6633029.93554688, 196714.135986328 6633045.12963867, 196708.317016602 6633059.35400391, 196699.265136719 6633081.01367188, 196692.799560547 6633095.23779297, 196686.599975586 6633109.80004883, 196679.545166016 6633126.59594727, 196673.726074219 6633140.17358398, 196662.300048828 6633164.5, 196655.945800781 6633178.32055664, 196649.480224609 6633193.51464844, 196639.900024414 6633219, 196632.599975586 6633232.89990235, 196628.099975586 6633242.30004883, 196617.699951172 6633269.10009766, 196604.699951172 6633295.60009766, 196600.5 6633307.10009766, 196589.699951172 6633334.80004883, 196579.699951172 6633361.10009766, 196573.8 6633374.4, 196569.169433594 6633384.18432617, 196557.576904297 6633409.05175781, 196550.964477539 6633424.34301758, 196543.800048828 6633441.5, 196536.086669922 6633460.09106445, 196532.489990234 6633468.47998047, 196529 6633477.39990235, 196518.300048828 6633504.19995117, 196513.099975586 6633513.69995117, 196509.400024414 6633522.69995117, 196503.800048828 6633538.80004883, 196496 6633563.30004883, 196491.199951172 6633581.89990235, 196487.599975586 6633600, 196480.900024414 6633627.10009766, 196477.599975586 6633643.19995117, 196472.5 6633671.39990234, 196469.400024414 6633700.80004883, 196467.199951172 6633729.80004883, 196466.900024414 6633755.5, 196466.5 6633785.30004883, 196465.400024414 6633809.5, 196465.699951172 6633835.39990234, 196464.900024414 6633863.69995117, 196462.800048828 6633893.69995117, 196462.400024414 6633917.5, 196461.699951172 6633928.39990234, 196461 6633947.89990234, 196459.900024414 6633964, 196460.199951172 6633988.60009766, 196459.800048828 6634005, 196459.099975586 6634033.10009766, 196458.400024414 6634062.89990234, 196457.900024414 6634092.69995117, 196456 6634112.60009766, 196455.800048828 6634126.60009766, 196455.300048828 6634143.80004883, 196455.5 6634155.10009766, 196453.900024414 6634184.69995117, 196453.5 6634213.30004883, 196452.5 6634242.89990235, 196452.099975586 6634271.89990234, 196451.099975586 6634291.69995117, 196449.5 6634320.89990234, 196449.5 6634346.89990234, 196450.300048828 6634370.10009766, 196450 6634379.19995117, 196449.099975586 6634395.5, 196447.400024414 6634410.39990234, 196447.5 6634424.39990234, 196446.900024414 6634436.5, 196447.199951172 6634462.80004883, 196446.199951172 6634476.19995117, 196446.800048828 6634505.80004883, 196446.3 6634520, 196440.9 6634542.6, 196439.6 6634551.1, 196438.2 6634560.6, 196434.4 6634585.8, 196429.6 6634615, 196428.2 6634627.6, 196425.4 6634643.4, 196423.6 6634659.9, 196422.9 6634665.7, 196417.6 6634690.7, 196416.2 6634698.7, 196416.7 6634712.4, 196416.800048828 6634717.5, 196420.400024414 6634746.69995117, 196424.900024414 6634775.30004883, 196429 6634796.19995117, 196435.099975586 6634824.60009766, 196436.599975586 6634839.10009766, 196438.400024414 6634869, 196436.569946289 6634897.75, 196435 6634905, 196426.599975586 6634932.5, 196423 6634942, 196408.900024414 6634967, 196392.800048828 6634991, 196389.1 6634998))\",\"lengde\":7617.0,\"segmenter\":[{\"seqno\":0,\"veglenke\":181344,\"start_posisjon\":0.781636848698101,\"slutt_posisjon\":1.0,\"retning\":\"med\",\"sideposisjon\":\"NULL\",\"geometri\":\"LINESTRING (196729.81008317033 6633009.4624330755, 196729.330078125 6633010.53881836, 196720.924804688 6633029.93554688, 196714.135986328 6633045.12963867, 196708.317016602 6633059.35400391, 196699.265136719 6633081.01367188, 196692.799560547 6633095.23779297, 196686.599975586 6633109.80004883, 196679.545166016 6633126.59594727, 196673.726074219 6633140.17358398, 196662.300048828 6633164.5, 196655.945800781 6633178.32055664, 196649.480224609 6633193.51464844, 196639.900024414 6633219, 196632.599975586 6633232.89990235, 196628.099975586 6633242.30004883, 196617.699951172 6633269.10009766, 196604.699951172 6633295.60009766, 196600.5 6633307.10009766, 196589.699951172 6633334.80004883, 196579.699951172 6633361.10009766, 196573.8 6633374.4, 196569.169433594 6633384.18432617, 196557.576904297 6633409.05175781, 196550.964477539 6633424.34301758, 196543.800048828 6633441.5, 196536.086669922 6633460.09106445, 196532.489990234 6633468.47998047, 196529 6633477.39990235, 196518.300048828 6633504.19995117, 196513.099975586 6633513.69995117, 196509.400024414 6633522.69995117, 196503.800048828 6633538.80004883, 196496 6633563.30004883, 196491.199951172 6633581.89990235, 196487.599975586 6633600, 196480.900024414 6633627.10009766, 196477.599975586 6633643.19995117, 196472.5 6633671.39990234, 196469.400024414 6633700.80004883, 196467.199951172 6633729.80004883, 196466.900024414 6633755.5, 196466.5 6633785.30004883, 196465.400024414 6633809.5, 196465.699951172 6633835.39990234, 196464.900024414 6633863.69995117, 196462.800048828 6633893.69995117, 196462.400024414 6633917.5, 196461.699951172 6633928.39990234, 196461 6633947.89990234, 196459.900024414 6633964, 196460.199951172 6633988.60009766, 196459.800048828 6634005, 196459.099975586 6634033.10009766, 196458.400024414 6634062.89990234, 196457.900024414 6634092.69995117, 196456 6634112.60009766, 196455.800048828 6634126.60009766, 196455.300048828 6634143.80004883, 196455.5 6634155.10009766, 196453.900024414 6634184.69995117, 196453.5 6634213.30004883, 196452.5 6634242.89990235, 196452.099975586 6634271.89990234, 196451.099975586 6634291.69995117, 196449.5 6634320.89990234, 196449.5 6634346.89990234, 196450.300048828 6634370.10009766, 196450 6634379.19995117, 196449.099975586 6634395.5, 196447.400024414 6634410.39990234, 196447.5 6634424.39990234, 196446.900024414 6634436.5, 196447.199951172 6634462.80004883, 196446.199951172 6634476.19995117, 196446.800048828 6634505.80004883, 196446.3 6634520, 196440.9 6634542.6, 196439.6 6634551.1, 196438.2 6634560.6, 196434.4 6634585.8, 196429.6 6634615, 196428.2 6634627.6, 196425.4 6634643.4, 196423.6 6634659.9, 196422.9 6634665.7, 196417.6 6634690.7, 196416.2 6634698.7, 196416.7 6634712.4, 196416.800048828 6634717.5, 196420.400024414 6634746.69995117, 196424.900024414 6634775.30004883, 196429 6634796.19995117, 196435.099975586 6634824.60009766, 196436.599975586 6634839.10009766, 196438.400024414 6634869, 196436.569946289 6634897.75, 196435 6634905, 196426.599975586 6634932.5, 196423 6634942, 196408.900024414 6634967, 196392.800048828 6634991, 196389.1 6634998)\",\"kommune\":631,\"fylke\":6,\"region\":2,\"vegavdeling\":6,\"politidistrikt\":9,\"vegreferanse\":{\"fylke\":6,\"kommune\":631,\"kategori\":\"F\",\"status\":\"V\",\"nummer\":88,\"hp\":2,\"fra_meter\":310,\"til_meter\":2363}},{\"seqno\":0,\"veglenke\":181111,\"start_posisjon\":0.0,\"slutt_posisjon\":0.880635240028163,\"retning\":\"med\",\"sideposisjon\":\"NULL\",\"geometri\":\"LINESTRING (196389.1 6634998, 196385.1 6635005.4, 196377.1 6635017.7, 196370.4 6635028.8, 196363 6635040, 196357.6 6635048.2, 196343.6 6635073.1, 196331.3 6635091.5, 196320.2 6635107.4, 196307.6 6635127.4, 196297.2 6635143.3, 196292 6635151.1, 196286.3 6635161.2, 196274.4 6635187.8, 196264.7 6635214.4, 196255.9 6635238.6, 196250.5 6635264.7, 196245.4 6635291.7, 196243.3 6635309, 196242.5 6635315.2, 196241.9 6635316.8, 196241.3 6635318, 196242.6 6635350.4, 196244.3 6635382.9, 196246.7 6635418.6, 196249.3 6635453, 196253.1 6635479.6, 196254.9 6635495.9, 196256.2 6635514.9, 196258.4 6635563, 196260 6635604.1, 196260.1 6635611.4, 196260.4 6635640.3, 196260.3 6635669.9, 196259.4 6635697, 196259 6635712.9, 196255.9 6635743.5, 196251.5 6635769.2, 196245.7 6635797, 196241.8 6635828.4, 196238.1 6635847.7, 196232.8 6635873.2, 196230 6635897.5, 196227.7 6635916.4, 196227.7 6635917.3, 196227.6 6635926.5, 196226.6 6635944.4, 196226.3 6635953.5, 196227.5 6635980.5, 196230.5 6636010.9, 196236.6 6636042, 196243.4 6636069.9, 196250.2 6636098.8, 196257.2 6636127.6, 196263.2 6636155.4, 196269.7 6636183.7, 196276.8 6636212.7, 196282.5 6636241.8, 196289.5 6636271.2, 196292.6 6636283.9, 196296.6 6636299.9, 196303 6636325.6, 196309.8 6636353.1, 196316.3 6636377.3, 196323.9 6636406.2, 196330.6 6636440.6, 196337.6 6636472.2, 196344.5 6636505, 196349.2 6636539.4, 196353.5 6636573.6, 196358 6636609.2, 196364.1 6636647.5, 196370.6 6636683.5, 196379.3 6636718.9, 196390.6 6636753.6, 196402.8 6636785.5, 196413.3 6636815.6, 196425.8 6636841.1, 196436.6 6636863.7, 196438.1 6636866.7, 196447.6 6636884.5, 196454.3 6636898.3, 196465.3 6636924.8, 196475.3 6636953.1, 196485 6636981.1, 196495.2 6637009, 196499.3 6637029.4, 196503.5 6637058.7, 196505.2 6637087.6, 196505.3 6637105.6, 196506.2 6637126.5, 196506.6 6637140.2, 196506.8 6637169.7, 196504.7 6637199.1, 196502.9 6637228.2, 196501.3 6637243, 196500.3 6637272.9, 196500.2 6637289.7, 196499.4 6637312.7, 196496.9 6637339, 196490.2 6637367.4, 196482.2 6637395.6, 196481.3 6637396.6, 196479 6637403, 196466.5 6637428.2, 196452.5 6637453.4, 196446.9 6637461.3, 196445.9 6637462.7, 196444.9 6637464, 196436 6637476.6, 196420 6637496.9, 196409.4 6637509.3, 196394.8 6637529.1, 196383.8 6637547.2, 196383.3 6637548.1, 196374.5 6637567.2, 196368 6637586.3, 196362.6 6637604.4, 196357.6 6637620.7, 196354.5 6637634.7, 196351.6 6637653.6, 196349.1 6637670.4, 196348.9 6637683, 196349.9 6637704.1, 196352.8 6637729.8, 196357 6637754.5, 196365.9 6637784.4, 196372.2 6637801.6, 196377.5 6637818, 196383.3 6637838.5, 196389.4 6637858.2, 196391.2 6637872, 196392.7 6637883, 196394.5 6637906.6, 196393.8 6637929.2, 196392.8 6637952.2, 196390.2 6637973.8, 196387.9 6637988.7, 196384.8 6638008.4, 196382.7 6638028.3, 196382.6 6638048.1, 196381.5 6638065.8, 196382 6638086.1, 196384.4 6638107.9, 196388.4 6638132.1, 196393 6638155.6, 196398.9 6638173.3, 196406.5 6638194.3, 196414.9 6638214.1, 196422.5 6638233.7, 196428.7 6638252.1, 196433.7 6638272.4, 196437.9 6638292.1, 196442 6638305.9, 196443.8 6638321.1, 196445.4 6638342.9, 196446.5 6638363, 196447.4 6638381.3, 196448.5 6638397.6, 196447.2 6638409.8, 196445.5 6638420.8, 196444.1 6638429.9, 196430.1 6638452.8, 196420.6 6638465.4, 196410 6638478.9, 196393.7 6638496.7, 196381.3 6638515.8, 196375.5 6638524.4, 196368.3 6638544.9, 196362.5 6638567.9, 196358.1 6638591.9, 196353.2 6638618.3, 196348.1 6638644.5, 196343.7 6638670.3, 196339.4 6638696.1, 196333.5 6638722.5, 196333.3 6638723.7, 196328.3 6638748, 196322.1 6638773.9, 196321.4 6638776.5, 196319.1 6638787.4, 196316.7 6638798.2, 196316.1 6638801.3, 196314.8 6638807.8, 196311.400024414 6638826.60009766, 196306.900024414 6638852.39990234, 196304.099975586 6638870.39990234, 196300.199951172 6638893, 196296.900024414 6638910.29980469, 196291.800048828 6638927.20019531, 196287.400024414 6638935.60009766, 196281.5 6638949.89990234, 196273.099975586 6638962.70019531, 196265.099975586 6638972.60009766, 196253.800048828 6638984.79980469, 196242.400024414 6638995.20019531, 196233.699951172 6639001.79980469, 196222 6639007.10009766, 196206.300048828 6639013.79980469, 196190.599975586 6639020.79980469, 196178 6639026.70019531, 196167.199951172 6639031.20019531, 196155.699951172 6639037.60009766, 196147.599975586 6639041.79980469, 196144 6639043.39990235, 196138.75 6639047.72021484, 196131.400024414 6639053.89990234, 196126.800048828 6639058.70019531, 196119.199951172 6639071.20019531, 196113.800048828 6639081, 196108.300048828 6639096.79980469, 196104.800048828 6639108, 196102.400024414 6639116.79980469, 196099.599975586 6639133, 196098.400024414 6639147.79980469, 196097.900024414 6639154.70019531, 196095.5 6639175.20019531, 196093.400024414 6639190.20019531, 196092 6639209.90039063, 196091.099975586 6639225.29980469, 196091.640014648 6639236.84960938, 196094.400024414 6639255.20019531, 196098.599975586 6639275.59960938, 196104.900024414 6639291.70019531, 196119.300048828 6639319.70019531, 196133 6639346.09960938, 196146.199951172 6639364.90039062, 196161.800048828 6639384.09960938, 196180.199951172 6639402.40039063, 196198.699951172 6639420.79980469, 196207.699951172 6639428.5, 196217.5 6639443.59960938, 196224.900024414 6639460.59960938, 196232 6639472.59960938, 196244.800048828 6639485.5, 196256.300048828 6639498.5, 196268.5 6639513.90039063, 196281.699951172 6639528.59960938, 196292.800048828 6639540.59960938, 196303.699951172 6639553.29980469, 196312.599975586 6639563.5, 196320.400024414 6639574.09960938, 196326.300048828 6639583.5, 196335.800048828 6639599.40039063, 196342 6639611.90039063, 196349 6639627.29980469, 196355 6639645.59960938, 196357.7 6639657.1, 196360.3 6639671.1, 196362.7 6639684.8, 196365.6 6639703.6, 196367.6 6639719.5, 196369.1 6639732.5, 196370.3 6639749.8, 196370.3 6639752, 196371.6 6639779.8, 196369.5 6639797.7, 196362.5 6639820, 196354.7 6639840.8, 196347.3 6639862.3, 196341.9 6639880.4, 196334.4 6639899.3, 196327.2 6639921.7, 196321.2 6639943.3, 196317.5 6639959.2, 196314.4 6639982.6, 196311.5 6640003.6, 196307.6 6640023.9, 196302.7 6640043.6, 196297.1 6640060.6, 196290.4 6640075.5, 196283.5 6640089.6, 196277 6640101.4, 196272.8 6640110.6, 196268.6 6640120.5, 196267.7 6640125, 196266.2 6640135, 196266.2 6640143, 196267.2 6640156.1, 196268.8 6640168.1, 196270.9 6640180.5, 196272.6 6640192.1, 196272.7 6640202.3, 196272.4629380733 6640216.227388193)\",\"kommune\":631,\"fylke\":6,\"region\":2,\"vegavdeling\":6,\"politidistrikt\":9,\"vegreferanse\":{\"fylke\":6,\"kommune\":631,\"kategori\":\"F\",\"status\":\"V\",\"nummer\":88,\"hp\":2,\"fra_meter\":2363,\"til_meter\":7927}}]}}").getAsJsonObject();

        String expectedStartDate = "2010-02-02";

        assertEquals(expectedStartDate, GsonUtil.parseStringMember(e, "versjon.startdato"));
    }
}
