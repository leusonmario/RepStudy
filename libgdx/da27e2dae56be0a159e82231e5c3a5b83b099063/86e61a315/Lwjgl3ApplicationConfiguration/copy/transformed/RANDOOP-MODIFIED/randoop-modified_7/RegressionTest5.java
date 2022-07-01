import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(167772160, 372608, (-208), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4227072) + "'", int4 == (-4227072));
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-112227840), (-41943040), (-262352), (-3232));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-8.491742E37f) + "'", float4 == (-8.491742E37f));
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (short) 1);
        float float4 = color1.b;
        int int5 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color6 = color1.clamp();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.003921569f + "'", float4 == 0.003921569f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.r = (-2105736960);
        int int15 = lwjgl3ApplicationConfiguration12.windowY;
        lwjgl3ApplicationConfiguration12.windowMaxHeight = (-2144);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color1.g = (short) -1;
        com.badlogic.gdx.graphics.Color color16 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color17 = color1.clamp();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, (-503341578));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 862994742;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setAudioConfig((-6555919), 16771616, 161902304);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(224);
        float float2 = color1.r;
        com.badlogic.gdx.graphics.Color color4 = color1.set((-1077936368));
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, (-764808));
        com.badlogic.gdx.graphics.Color color12 = color4.set((float) 1606278944, (float) (-1972440832), 0.43529412f, (float) (-8160));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1077936368) + "'", int5 == (-1077936368));
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.depth = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.disableAudio = false;
        lwjgl3ApplicationConfiguration14.setwindowWidth(63151);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        int int22 = lwjgl3ApplicationConfiguration19.b;
        boolean boolean23 = lwjgl3ApplicationConfiguration19.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType24 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType24);
        int int26 = lwjgl3ApplicationConfiguration19.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        boolean boolean28 = lwjgl3ApplicationConfiguration19.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        int int32 = lwjgl3ApplicationConfiguration29.depth;
        int int33 = lwjgl3ApplicationConfiguration29.stencil;
        int int34 = lwjgl3ApplicationConfiguration29.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode35);
        int int37 = lwjgl3ApplicationConfiguration29.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        int int41 = lwjgl3ApplicationConfiguration38.b;
        boolean boolean42 = lwjgl3ApplicationConfiguration38.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType43 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration38.setpreferencesFileType(fileType43);
        int int45 = lwjgl3ApplicationConfiguration38.depth;
        lwjgl3ApplicationConfiguration38.windowX = 765;
        int int48 = lwjgl3ApplicationConfiguration38.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = lwjgl3ApplicationConfiguration38.hdpiMode;
        lwjgl3ApplicationConfiguration29.hdpiMode = hdpiMode49;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode49;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration52);
        lwjgl3ApplicationConfiguration53.r = ' ';
        lwjgl3ApplicationConfiguration53.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = lwjgl3ApplicationConfiguration53.hdpiMode;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode58;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode58;
        int int61 = lwjgl3ApplicationConfiguration14.stencil;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 16 + "'", int45 == 16);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration53);
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', 0, 509920, 863980544, 6349110, 0, 0);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-1);
        boolean boolean20 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int21 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 7712224;
        lwjgl3ApplicationConfiguration0.r = 131072;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-233897984), (float) (-8303), (-1.7014086E38f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16738848) + "'", int3 == (-16738848));
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 40664886;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.title = "d2b48cff";
        int int23 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1621098495, (-12), (-227328));
        int int28 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-227328) + "'", int28 == (-227328));
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-62876));
        color3.a = 16711680;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color7 = color6.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, (-134217944));
        float float10 = color6.g;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color6);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.9047619f + "'", float10 == 0.9047619f);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0, 3855, (-859607296), (-8453888));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.1068623E28f + "'", float4 == 1.1068623E28f);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(32256);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 512);
        int int7 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float12 = color11.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color17;
        int int19 = com.badlogic.gdx.graphics.Color.rgb888(color17);
        boolean boolean21 = color17.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color26;
        com.badlogic.gdx.graphics.Color color32 = color26.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color33 = color17.mul(color32);
        com.badlogic.gdx.graphics.Color color35 = color32.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color32, 9);
        com.badlogic.gdx.graphics.Color color39 = color32.set((-4089));
        com.badlogic.gdx.graphics.Color color40 = color11.sub(color39);
        com.badlogic.gdx.graphics.Color color42 = color1.lerp(color39, (float) (-150));
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color48 = color43.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color49);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color((float) 6349110, 0.0f, (float) (byte) 0, (float) 1);
        com.badlogic.gdx.graphics.Color color56 = color49.sub(color55);
        com.badlogic.gdx.graphics.Color color58 = color48.lerp(color55, (float) 255);
        int int59 = com.badlogic.gdx.graphics.Color.rgba8888(color55);
        com.badlogic.gdx.graphics.Color color60 = color1.sub(color55);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color60, (-4466532));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 131072 + "'", int7 == 131072);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-16776961) + "'", int59 == (-16776961));
        org.junit.Assert.assertNotNull(color60);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.setuseGL30(false);
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 65295);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color17 = color12.set(65295);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        lwjgl3ApplicationConfiguration21.setvSyncEnabled(false);
        boolean boolean24 = lwjgl3ApplicationConfiguration21.getuseGL30();
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color28, 16);
        color28.a = 0L;
        com.badlogic.gdx.graphics.Color color33 = color26.mul(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        int int40 = com.badlogic.gdx.graphics.Color.rgb888(color38);
        boolean boolean42 = color38.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.stencil = 10;
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration43.initialBackgroundColor = color47;
        com.badlogic.gdx.graphics.Color color53 = color47.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color54 = color38.mul(color53);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color53);
        com.badlogic.gdx.graphics.Color color56 = color28.set(color55);
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color56);
        com.badlogic.gdx.graphics.Color color58 = color19.add(color56);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration59.stencil = 10;
        int int62 = lwjgl3ApplicationConfiguration59.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color63 = lwjgl3ApplicationConfiguration59.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color65 = color58.lerp(color63, 0.0f);
        com.badlogic.gdx.graphics.Color color67 = color17.lerp(color65, (float) (-2147413088));
        float float68 = color67.toFloatBits();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
// flaky:         org.junit.Assert.assertTrue("'" + float68 + "' != '" + (-1.6947657E38f) + "'", float68 == (-1.6947657E38f));
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration13.fullscreenMode;
        lwjgl3ApplicationConfiguration13.title = "";
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        lwjgl3ApplicationConfiguration21.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration21.setsamples((int) (byte) 10);
        int int27 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration21.setwindowWidth(0);
        lwjgl3ApplicationConfiguration21.depth = (byte) 100;
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration35);
        lwjgl3ApplicationConfiguration36.r = ' ';
        lwjgl3ApplicationConfiguration36.windowResizable = false;
        int int41 = lwjgl3ApplicationConfiguration36.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.stencil = 10;
        int int45 = lwjgl3ApplicationConfiguration42.depth;
        int int46 = lwjgl3ApplicationConfiguration42.stencil;
        int int47 = lwjgl3ApplicationConfiguration42.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = null;
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration42.hdpiMode = hdpiMode50;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration13.hdpiMode = hdpiMode50;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 1174394321;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 16 + "'", int45 == 16);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2385));
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int26 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        lwjgl3ApplicationConfiguration1.samples = (-3091);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-321707263));
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) (-16761866), (float) (-64), (float) 130029600, (float) (-848128));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        int int9 = lwjgl3ApplicationConfiguration8.samples;
        lwjgl3ApplicationConfiguration8.setwindowY(9);
        lwjgl3ApplicationConfiguration8.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float20 = color19.a;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration8.windowX = 'a';
        lwjgl3ApplicationConfiguration8.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration8.setwindowResizable(true);
        boolean boolean28 = color6.equals((java.lang.Object) lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        int int16 = lwjgl3ApplicationConfiguration12.getwindowWidth();
        lwjgl3ApplicationConfiguration12.setWindowedMode((-634322729), (-10223606));
        lwjgl3ApplicationConfiguration12.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration12.setwindowWidth((-17040896));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.stencil = 1897903;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-587202560));
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) 100;
        lwjgl3ApplicationConfiguration0.depth = (-4090624);
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration2.stencil = 10;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color6;
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color6);
        boolean boolean10 = color6.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color22 = color6.mul(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color21, 3);
        com.badlogic.gdx.graphics.Color color28 = color21.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color28, (-40036));
        com.badlogic.gdx.graphics.Color color31 = color1.sub(color28);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color38 = color33.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color40 = color33.set(8);
        com.badlogic.gdx.graphics.Color color41 = color1.mul(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration42.setwindowResizable(false);
        lwjgl3ApplicationConfiguration42.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration42.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration42.a = 2016;
        lwjgl3ApplicationConfiguration42.b = (-458762);
        int int61 = lwjgl3ApplicationConfiguration42.r;
        int int62 = lwjgl3ApplicationConfiguration42.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration42);
        boolean boolean64 = color40.equals((java.lang.Object) lwjgl3ApplicationConfiguration42);
        lwjgl3ApplicationConfiguration42.depth = (-9728477);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2016 + "'", int62 == 2016);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration11.setwindowWidth(2047);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(653055);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.windowY = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        boolean boolean15 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        lwjgl3ApplicationConfiguration5.windowMinWidth = 509920;
        boolean boolean18 = lwjgl3ApplicationConfiguration5.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        int int23 = lwjgl3ApplicationConfiguration20.depth;
        int int24 = lwjgl3ApplicationConfiguration20.stencil;
        int int25 = lwjgl3ApplicationConfiguration20.getwindowY();
        lwjgl3ApplicationConfiguration20.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration20.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        int int33 = lwjgl3ApplicationConfiguration30.b;
        boolean boolean34 = lwjgl3ApplicationConfiguration30.vSyncEnabled;
        lwjgl3ApplicationConfiguration30.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration20.preferencesFileType = fileType37;
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType37);
        int int41 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int42 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-2147450112));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration10.setwindowResizable(false);
        lwjgl3ApplicationConfiguration10.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration10.setWindowedMode(1465382614, (int) ' ');
        int int28 = lwjgl3ApplicationConfiguration10.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration10.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        lwjgl3ApplicationConfiguration32.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration32.setFullscreenMode(displayMode36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        int int39 = lwjgl3ApplicationConfiguration38.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration38.title = "hi!";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration42);
        lwjgl3ApplicationConfiguration43.r = ' ';
        lwjgl3ApplicationConfiguration43.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = lwjgl3ApplicationConfiguration43.hdpiMode;
        int int49 = lwjgl3ApplicationConfiguration43.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        lwjgl3ApplicationConfiguration52.setWindowPosition((int) (short) 10, 10);
        boolean boolean56 = lwjgl3ApplicationConfiguration52.useGL30;
        lwjgl3ApplicationConfiguration52.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType60 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration52.preferencesFileType = fileType60;
        lwjgl3ApplicationConfiguration43.setPreferencesConfig("", fileType60);
        lwjgl3ApplicationConfiguration38.preferencesFileType = fileType60;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType60);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType60);
        int int66 = lwjgl3ApplicationConfiguration0.b;
        int int67 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener7);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
        org.junit.Assert.assertTrue("'" + hdpiMode48 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode48.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + fileType60 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType60.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-1311135), (float) 65280, 6.1897002E29f, (float) (-1047005184));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6973261E38f) + "'", float4 == (-1.6973261E38f));
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowX();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        lwjgl3ApplicationConfiguration7.windowResizable = false;
        int int12 = lwjgl3ApplicationConfiguration7.windowHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-268435536));
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) 43371, (float) 6528502, (float) (-65025), (float) 480);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = color13.add(color18);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color24 = color22.mul((float) (-62876));
        color24.a = 16711680;
        com.badlogic.gdx.graphics.Color color31 = color24.mul((float) '#', (float) (-65536), (float) (-65025), (float) 553648000);
        com.badlogic.gdx.graphics.Color color32 = color13.set(color24);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color35 = color13.add(color34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int10 = lwjgl3ApplicationConfiguration0.b;
        int int11 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.0f, (float) (-3232), 0.0f, (float) 607);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4.686841E30f) + "'", float4 == (-4.686841E30f));
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-8453888);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(534839040);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(0.06666667f, (float) 62445, (float) (-8658177), (-1.6999093E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1905328384) + "'", int4 == (-1905328384));
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (byte) 1);
        com.badlogic.gdx.graphics.Color color8 = color1.mul((float) 765, (float) (byte) -1, (float) (short) 100, (float) 100);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color8, (-9371842));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float2 = color1.g;
        int int3 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        int int13 = lwjgl3ApplicationConfiguration0.samples;
        int int14 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int16 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) 6349110, 0.0f, (float) (byte) 0, (float) 1);
        com.badlogic.gdx.graphics.Color color7 = color0.sub(color6);
        color0.r = (-2147099648);
        com.badlogic.gdx.graphics.Color color10 = color0.cpy();
        float float11 = color0.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration1.a;
        int int9 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.setwindowHeight((-50331614));
        int int16 = lwjgl3ApplicationConfiguration1.stencil;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        int int5 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int7 = lwjgl3ApplicationConfiguration6.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setBackBufferConfig(8, 40664886, 0, (-100466688), 267782144, (-6553036), 16738740);
        lwjgl3ApplicationConfiguration1.b = 25500;
        lwjgl3ApplicationConfiguration1.setAudioConfig(16766720, (-321707263), 7048739);
        lwjgl3ApplicationConfiguration1.setwindowY((int) (short) -1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color4 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.title = "d2b48cff";
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000064";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.title;
        int int4 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(9.1655E-41f, (float) (-1075773696), (float) 3309388, (float) (-503341578));
        color4.b = 586415136;
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(1621098495);
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color23 = color21.mul((float) (-62876));
        color23.a = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        int int32 = com.badlogic.gdx.graphics.Color.rgb888(color30);
        boolean boolean34 = color30.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.stencil = 10;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color39;
        com.badlogic.gdx.graphics.Color color45 = color39.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color46 = color30.mul(color45);
        com.badlogic.gdx.graphics.Color color48 = color45.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color50 = color23.lerp(color48, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color55 = color50.sub((float) 16711935, (float) (short) 100, 0.0f, (-1.6947657E38f));
        com.badlogic.gdx.graphics.Color color56 = color18.mul(color50);
        com.badlogic.gdx.graphics.Color color61 = color50.add((float) (byte) 1, (float) 52897, (float) (-16738848), (-5.53230546E17f));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-569376768));
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color5 = color0.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        color0.g = (-1.7013859E38f);
        com.badlogic.gdx.graphics.Color color9 = color0.set(8);
        color9.g = 2097152;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int15 = lwjgl3ApplicationConfiguration14.depth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.windowMinHeight = 65471;
        lwjgl3ApplicationConfiguration0.windowX = 16776960;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowHeight = (-22978560);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-8303), (-1478332187), (-3091), (-2140996640));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014006E38f) + "'", float4 == (-1.7014006E38f));
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowX = (-654724064);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode8;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color7 = color6.clamp();
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color();
        int int11 = color10.toIntBits();
        int int12 = com.badlogic.gdx.graphics.Color.rgba4444(color10);
        com.badlogic.gdx.graphics.Color color14 = color9.lerp(color10, 0.0f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        int int21 = com.badlogic.gdx.graphics.Color.rgb888(color19);
        boolean boolean23 = color19.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        com.badlogic.gdx.graphics.Color color34 = color28.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color35 = color19.mul(color34);
        com.badlogic.gdx.graphics.Color color37 = color34.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.SKY;
        color38.g = 0L;
        com.badlogic.gdx.graphics.Color color41 = color37.mul(color38);
        com.badlogic.gdx.graphics.Color color42 = color14.mul(color38);
        com.badlogic.gdx.graphics.Color color47 = color14.add((-1.0f), (float) (-65280), 0.0f, (float) 16777216);
        com.badlogic.gdx.graphics.Color color49 = color7.lerp(color47, (float) 150929588);
        color47.r = 0.0f;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1953529918);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, 0.0f, (float) 626699475, (float) (-128));
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.g = (-2105736960);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-4090624);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getdepth();
        int int11 = lwjgl3ApplicationConfiguration9.getwindowX();
        lwjgl3ApplicationConfiguration9.title = "ffff0000";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 507505200, (float) 862994742, (float) (-551618560), (-1.2727115E38f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration1.windowListener;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-10223606));
        lwjgl3ApplicationConfiguration1.useVsync(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration7.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration7.vSyncEnabled = false;
        int int14 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        int int15 = lwjgl3ApplicationConfiguration7.getwindowMinWidth();
        lwjgl3ApplicationConfiguration7.windowMinWidth = (-151261803);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration13.getClass();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(1677721600, 0, 48624, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-34603008) + "'", int4 == (-34603008));
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 0;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        float float22 = color21.toFloatBits();
        com.badlogic.gdx.graphics.Color color23 = color21.premultiplyAlpha();
        java.lang.Class<?> wildcardClass24 = color23.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.3509886E-38f + "'", float22 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8);
        lwjgl3ApplicationConfiguration0.setsamples((-10224128));
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.samples = (-1502683136);
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowX();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.b;
        boolean boolean14 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType15);
        int int17 = lwjgl3ApplicationConfiguration10.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        boolean boolean19 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration22.setsamples((int) (byte) 10);
        int int28 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration22.windowHeight = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.depth;
        lwjgl3ApplicationConfiguration32.windowX = (short) 100;
        lwjgl3ApplicationConfiguration32.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("ff000000", fileType41);
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType41);
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType41);
        int int45 = lwjgl3ApplicationConfiguration7.getdepth();
        int int46 = lwjgl3ApplicationConfiguration7.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 16 + "'", int45 == 16);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-7798785), (float) (short) 100, 1.0f, (float) (-63488));
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) 16776961, (float) 765, (float) (-13520608), (float) 536867136);
        java.lang.String str10 = color9.toString();
        boolean boolean12 = color9.equals((java.lang.Object) (-480788480));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ffff00ff" + "'", str10, "ffff00ff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, 1.96271E-40f, (-256.0f), (-9.371056E37f));
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) 6349110, 0.0f, (float) (byte) 0, (float) 1);
        com.badlogic.gdx.graphics.Color color7 = color0.sub(color6);
        int int8 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        com.badlogic.gdx.graphics.Color color10 = color0.mul((float) (short) -1);
        int int11 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.SKY;
        color23.g = 0L;
        com.badlogic.gdx.graphics.Color color26 = color22.mul(color23);
        com.badlogic.gdx.graphics.Color color28 = color26.set(6349110);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color30, 16);
        float float33 = color30.g;
        int int34 = com.badlogic.gdx.graphics.Color.rgba8888(color30);
        com.badlogic.gdx.graphics.Color color35 = color28.set(color30);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color30, (int) (short) 10);
        color30.g = 2.3418052E-38f;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 33791 + "'", int34 == 33791);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setdepth(553648000);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        int int8 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color1);
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color9 = color6.mul((float) (short) 0);
        color9.r = 25500;
        color9.a = 863980544;
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33791 + "'", int5 == 33791);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.windowHeight = (-3825);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        lwjgl3ApplicationConfiguration0.samples = '4';
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.windowResizable;
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion = (-1905328384);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-256);
        int int11 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int12 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration2.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode5 = null;
        lwjgl3ApplicationConfiguration2.fullscreenMode = lwjgl3DisplayMode5;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.stencil = 10;
        int int10 = lwjgl3ApplicationConfiguration7.b;
        boolean boolean11 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType12 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType12);
        int int14 = lwjgl3ApplicationConfiguration7.depth;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (short) 10;
        int int17 = lwjgl3ApplicationConfiguration7.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        int int21 = lwjgl3ApplicationConfiguration18.b;
        boolean boolean22 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        lwjgl3ApplicationConfiguration18.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration2.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration2.setAudioConfig((-7555886), 15, (-503316225));
        lwjgl3ApplicationConfiguration2.setAudioConfig((-69737088), (-2968436), (-63488));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowHeight = (-545421065);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(63518);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.valueOf("00000000");
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        int int18 = lwjgl3ApplicationConfiguration0.a;
        int int19 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode12;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources((-369098752));
        lwjgl3ApplicationConfiguration11.setWindowedMode((-1286733314), 5959695);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 11059605, (float) 8420355, (float) (-62876), (-4.2866305E37f));
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 16777215;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setwindowWidth(33791);
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.a = (-5543167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color15 = color4.mul((float) '#', (float) (-10223606), (float) (-545421065), (float) 3309388);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 16);
        color19.a = 0L;
        com.badlogic.gdx.graphics.Color color24 = color17.mul(color19);
        com.badlogic.gdx.graphics.Color color29 = color17.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color30 = color4.set(color29);
        com.badlogic.gdx.graphics.Color color31 = color30.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color32 = color31.cpy();
        color31.a = 43371;
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-654724064);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-9728477));
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 1929379839, (-1.7007336E38f), (float) (-262352), (float) 131);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13577603) + "'", int4 == (-13577603));
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str41 = lwjgl3ApplicationConfiguration1.title;
        int int42 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        int int43 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        int int44 = lwjgl3ApplicationConfiguration1.getwindowY();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int10 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-10224128), 0, (int) '4', 6528502);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.windowWidth = 1621098495;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.b = 8616705;
        int int19 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-535758336), (float) (-2144), 0.0f, (-1.7011532E38f));
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.0431761E38f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', 0, 509920, 863980544, 6349110, 0, 0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-29852));
        boolean boolean20 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.r = (-100466688);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1593770240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-10224128));
        float float2 = color1.b;
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99607843f + "'", float2 == 0.99607843f);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, 33791);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color16, 131);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 3, (-1.7014117E38f), (float) 3, (float) '#');
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) (-15196159), (float) (-33488896), (float) 704, (float) (-16646145));
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setsamples(63151);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.g = 514080;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(65280);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdepth((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration1.windowMinWidth = 553648000;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 63518;
        lwjgl3ApplicationConfiguration1.stencil = 130029600;
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-225));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) 10, (float) 786400, (float) 7680, (float) 1953529918);
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 585070592, (float) 3840, (float) 16777059, (float) (-36));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-220) + "'", int4 == (-220));
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(1.06321716E37f, (float) 4080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-240) + "'", int2 == (-240));
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-18866176));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration9.setdepth((-1478332187));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        float float23 = color22.a;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowY = (byte) -1;
        int int18 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        int int19 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        lwjgl3ApplicationConfiguration1.setdepth(7048739);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration22.setwindowResizable(false);
        lwjgl3ApplicationConfiguration22.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration22.gles30ContextMajorVersion = 0;
        int int37 = lwjgl3ApplicationConfiguration22.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        int int42 = lwjgl3ApplicationConfiguration39.depth;
        lwjgl3ApplicationConfiguration39.windowX = (short) 100;
        lwjgl3ApplicationConfiguration39.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration39.getpreferencesFileType();
        int int49 = lwjgl3ApplicationConfiguration39.getwindowY();
        lwjgl3ApplicationConfiguration39.samples = 512;
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration39.initialBackgroundColor;
        int int53 = lwjgl3ApplicationConfiguration39.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = lwjgl3ApplicationConfiguration39.hdpiMode;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode54);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 509920;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        int int19 = lwjgl3ApplicationConfiguration15.stencil;
        int int20 = lwjgl3ApplicationConfiguration15.getwindowY();
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration35.setwindowWidth(65280);
        boolean boolean38 = lwjgl3ApplicationConfiguration35.windowResizable;
        lwjgl3ApplicationConfiguration35.windowMaxWidth = 585070592;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.49803922f, (float) 1L, (float) (short) 10, (float) (-52344));
        color4.a = (-1502683136);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        int int9 = lwjgl3ApplicationConfiguration1.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener10);
        boolean boolean12 = lwjgl3ApplicationConfiguration1.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration7.windowHeight;
        lwjgl3ApplicationConfiguration7.setwindowX(1900764);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.windowMinHeight = 0;
        int int10 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration12.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.b = (-52320);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        int int19 = lwjgl3ApplicationConfiguration18.samples;
        lwjgl3ApplicationConfiguration18.setwindowY(9);
        lwjgl3ApplicationConfiguration18.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration18.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int28 = lwjgl3ApplicationConfiguration27.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType30 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("", fileType30);
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType30);
        lwjgl3ApplicationConfiguration18.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration18.windowHeight = (-2147481728);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.stencil = 10;
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration37.initialBackgroundColor = color41;
        lwjgl3ApplicationConfiguration37.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration37.initialBackgroundColor = color45;
        lwjgl3ApplicationConfiguration37.g = 16711680;
        int int49 = lwjgl3ApplicationConfiguration37.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration37.audioDeviceBufferSize = 0;
        int int52 = lwjgl3ApplicationConfiguration37.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = lwjgl3ApplicationConfiguration37.hdpiMode;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode53;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        int int56 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 131090400, (float) 65536, (float) (-805306623), (float) (-6168960));
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration9.fullscreenMode;
        lwjgl3ApplicationConfiguration9.setwindowDecorated(true);
        int int14 = lwjgl3ApplicationConfiguration9.a;
        lwjgl3ApplicationConfiguration9.windowWidth = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1948738560));
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.MAROON;
        java.lang.String str21 = color20.toString();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 1769996257;
        int int25 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int26 = lwjgl3ApplicationConfiguration0.r;
        int int27 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.r = 4080;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "827d0100" + "'", str21, "827d0100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int12 = lwjgl3ApplicationConfiguration11.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-4628480), (float) (-10), (float) 2073378560, (float) (-13126704));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16) + "'", int4 == (-16));
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-1905328384), (float) (-5543167));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1413507584) + "'", int2 == (-1413507584));
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 25500, (float) 3855, (float) 863980544, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, 3309388);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.stencil = 10;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color11;
        int int13 = com.badlogic.gdx.graphics.Color.rgb888(color11);
        boolean boolean15 = color11.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color20;
        com.badlogic.gdx.graphics.Color color26 = color20.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color27 = color11.mul(color26);
        com.badlogic.gdx.graphics.Color color29 = color26.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.SKY;
        color30.g = 0L;
        com.badlogic.gdx.graphics.Color color33 = color29.mul(color30);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color35 = color4.mul(color29);
        float float36 = color4.b;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color35);
// flaky:         org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1077936368), (int) (short) 100);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((float) 0L, (float) 640, (float) ' ', (float) (-1));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float22 = color21.b;
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(704);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color25;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        int int30 = lwjgl3ApplicationConfiguration27.b;
        boolean boolean31 = lwjgl3ApplicationConfiguration27.vSyncEnabled;
        lwjgl3ApplicationConfiguration27.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration27.windowListener = lwjgl3WindowListener34;
        lwjgl3ApplicationConfiguration27.setgles30ContextMinorVersion(0);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration27.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-151261803));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int20 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-15514229));
        int int16 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-65536));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(2147418367);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-22);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-225));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 267782144, 0.0f, 0.0f, (-1.7006882E38f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.7014117E38f + "'", float4 == 1.7014117E38f);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        int int10 = lwjgl3ApplicationConfiguration1.getdepth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration1.setdepth(2146972160);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-142049825);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        lwjgl3ApplicationConfiguration1.b = 1619023104;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-26), (float) 8978431, (-2.14741837E9f), (-1.6950771E38f));
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-151125872), (-20224));
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = color23.mul(1.0f, (float) 43371, (float) (-4089), (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color28, 267782144);
        com.badlogic.gdx.graphics.Color color36 = color28.lerp((-1.3606088E22f), (float) (-276908320), (-3.915235E-31f), (float) (-9728477), (float) (-16580607));
        color28.g = 14417949;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color5 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) (-1469452288), (float) (-393216), (float) (-438453248), (float) 13770);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        int int40 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration1.setWindowPosition((-2144), 1174394321);
        int int44 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        int int45 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.samples = (-92044800);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1174394321 + "'", int45 == 1174394321);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowY(8925);
        lwjgl3ApplicationConfiguration0.g = 33791;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode15;
        lwjgl3ApplicationConfiguration0.setwindowX((-480788480));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str20 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BLUE;
        com.badlogic.gdx.graphics.Color color24 = color23.cpy();
        color24.g = (-1.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color24);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color27;
        lwjgl3ApplicationConfiguration0.depth = (-535758336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        int int12 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1769996257;
        lwjgl3ApplicationConfiguration0.setWindowPosition(1055, 52625);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color7 = color6.clamp();
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color();
        int int11 = color10.toIntBits();
        int int12 = com.badlogic.gdx.graphics.Color.rgba4444(color10);
        com.badlogic.gdx.graphics.Color color14 = color9.lerp(color10, 0.0f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        int int21 = com.badlogic.gdx.graphics.Color.rgb888(color19);
        boolean boolean23 = color19.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        com.badlogic.gdx.graphics.Color color34 = color28.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color35 = color19.mul(color34);
        com.badlogic.gdx.graphics.Color color37 = color34.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.SKY;
        color38.g = 0L;
        com.badlogic.gdx.graphics.Color color41 = color37.mul(color38);
        com.badlogic.gdx.graphics.Color color42 = color14.mul(color38);
        com.badlogic.gdx.graphics.Color color47 = color14.add((-1.0f), (float) (-65280), 0.0f, (float) 16777216);
        com.badlogic.gdx.graphics.Color color49 = color7.lerp(color47, (float) 150929588);
        com.badlogic.gdx.graphics.Color color54 = color49.add((float) (-151390720), (float) (-262352), (float) (-138042720), (float) 3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color54);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-36880));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 65533;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(1465382614);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        int int15 = com.badlogic.gdx.graphics.Color.rgb888(color13);
        boolean boolean17 = color13.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color29 = color13.mul(color28);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color31 = color3.set(color30);
        float float32 = color31.b;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.FOREST;
        com.badlogic.gdx.graphics.Color color34 = color31.set(color33);
        com.badlogic.gdx.graphics.Color color35 = color34.premultiplyAlpha();
        int int36 = com.badlogic.gdx.graphics.Color.rgb888(color35);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2263842 + "'", int36 == 2263842);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1671024128), (float) 97, (float) (-256), 1.7014117E38f);
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) (byte) -1, (float) 16776961, (-256.0f), 0.98039216f);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color9);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(16711935, (-1077952513), 586415136, (int) '#', (-16), (-62876), (-2089026813));
        lwjgl3ApplicationConfiguration0.depth = 1174394321;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener7);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-62876);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1972440832), (-150361792), 16714230, 26180);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.depth = 2147418367;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 777825, 0.13333334f, (float) (-2147451392), (float) (-32));
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BLACK;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = color3.mul(color7);
        com.badlogic.gdx.graphics.Color color14 = color7.mul((float) 16777059, (float) 1671172080, 0.4392157f, (float) 16777087);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) '#', (float) (short) -1, (-4.319983E37f), 10.0f);
        com.badlogic.gdx.graphics.Color color9 = color4.add((-1.6947657E38f), (float) 9, (float) (-15), (float) (-16842496));
        int int10 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65280 + "'", int10 == 65280);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 7680, (float) 4080, (-4.253659E37f), (float) (-1613299457));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1662054400) + "'", int4 == (-1662054400));
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration2.getwindowY();
        int int4 = lwjgl3ApplicationConfiguration2.audioDeviceBufferCount;
        java.lang.String str5 = lwjgl3ApplicationConfiguration2.preferencesDirectory;
        lwjgl3ApplicationConfiguration2.setvSyncEnabled(false);
        int int8 = lwjgl3ApplicationConfiguration2.getwindowMinWidth();
        lwjgl3ApplicationConfiguration2.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1233169392));
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 0L, (float) 640, (float) ' ', (float) (-1));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((float) 33791, 0.0f, (float) (-654724064), (float) 33791);
        com.badlogic.gdx.graphics.Color color10 = color4.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 16);
        float float15 = color12.g;
        float float16 = color12.a;
        com.badlogic.gdx.graphics.Color color17 = color9.set(color12);
        float float18 = color9.b;
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.516129f + "'", float18 == 0.516129f);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 'a', (float) (-16181535), (-1.7005746E38f), (float) 65348);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1610726212) + "'", int4 == (-1610726212));
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-15514229));
        lwjgl3ApplicationConfiguration1.disableAudio(true);
        boolean boolean18 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration1.windowListener;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 16777215;
        lwjgl3ApplicationConfiguration0.samples = 1953529918;
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float13 = color12.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration1.windowX = 'a';
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) '4', 1677721600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener21);
        int int23 = lwjgl3ApplicationConfiguration1.getdepth();
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 62445;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (float) 16744959, (float) 2046, (float) 4096);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3584) + "'", int4 == (-3584));
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(653051);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = 1621098495;
        lwjgl3ApplicationConfiguration10.g = 16;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        lwjgl3ApplicationConfiguration10.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-497025568), (float) (-150361792), (float) 8616705, (-1.1841958E21f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-79474432) + "'", int4 == (-79474432));
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.samples = 63488;
        lwjgl3ApplicationConfiguration0.stencil = (-129024);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-6555919));
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = (-16776704);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(63456);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (-13577603));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 765);
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowY = (byte) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration18.preferencesDirectory = "00b48cff";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-844509056), (float) (-16033380), (float) (-40036), 0.0f);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.setDecorated(false);
        lwjgl3ApplicationConfiguration9.samples = 63151;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1948738560));
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-16738848), (-66797), 2560);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-151125872));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2147483647);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration2.stencil = 10;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color6;
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color6);
        boolean boolean10 = color6.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color22 = color6.mul(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color6);
        float float24 = color23.a;
        float float25 = color23.g;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color23, (-668991488));
        com.badlogic.gdx.graphics.Color color28 = color1.set(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        int int35 = com.badlogic.gdx.graphics.Color.rgb888(color33);
        boolean boolean37 = color33.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color42;
        com.badlogic.gdx.graphics.Color color48 = color42.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color49 = color33.mul(color48);
        com.badlogic.gdx.graphics.Color color50 = color48.premultiplyAlpha();
        float float51 = color48.b;
        float float52 = color48.toFloatBits();
        com.badlogic.gdx.graphics.Color color53 = color28.add(color48);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color53, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertNotNull(color53);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-63457);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color26 = color21.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color27 = color26.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.samples = (-5510160);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode31 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode31;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode7;
        int int9 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount(14420470);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-805306623), (float) (-51766));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13200330) + "'", int2 == (-13200330));
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-2.14741837E9f), (float) (-352419840), (float) (-1396305920), (float) 2005655137);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 132184352, 0.0f, (float) 491505);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36592) + "'", int3 == (-36592));
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-15514229), (float) (-2147483648), (float) (byte) 1, 0.5137255f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (byte) 0);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-2089026813));
        com.badlogic.gdx.graphics.Color color9 = color4.sub(color6);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (float) (-2320), (float) (-79474432), (float) (-2147451392));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-116391936) + "'", int4 == (-116391936));
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1621098495);
        com.badlogic.gdx.graphics.Color color5 = color1.set((-2096826780));
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 0;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        int int8 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        lwjgl3ApplicationConfiguration0.b = 401539072;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        int int15 = lwjgl3ApplicationConfiguration12.depth;
        int int16 = lwjgl3ApplicationConfiguration12.stencil;
        lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion = (-16580607);
        boolean boolean19 = lwjgl3ApplicationConfiguration12.getdisableAudio();
        lwjgl3ApplicationConfiguration12.setaudioDeviceSimultaneousSources((-1077952513));
        boolean boolean22 = lwjgl3ApplicationConfiguration12.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration23.setwindowResizable(false);
        lwjgl3ApplicationConfiguration23.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration23.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration23.setuseGL30(false);
        lwjgl3ApplicationConfiguration23.b = 512;
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color();
        int int44 = color43.toIntBits();
        int int45 = com.badlogic.gdx.graphics.Color.rgba4444(color43);
        com.badlogic.gdx.graphics.Color color47 = color42.lerp(color43, 0.0f);
        color47.r = 40664886;
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color47;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        lwjgl3ApplicationConfiguration52.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-548854));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-45312);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(16197090, (-654724064), (-393216), 62445);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6948306E38f), (float) (-20224), (float) 65535, (float) (-545421065));
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int16 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-16711681), (-157286400), 97);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.b = 6528502;
        lwjgl3ApplicationConfiguration1.windowMinHeight = 9;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener14;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(16738740);
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-36880);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int26 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(130029600);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-62876));
        color3.a = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.stencil = 10;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration6.initialBackgroundColor = color10;
        int int12 = com.badlogic.gdx.graphics.Color.rgb888(color10);
        boolean boolean14 = color10.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        com.badlogic.gdx.graphics.Color color25 = color19.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color26 = color10.mul(color25);
        com.badlogic.gdx.graphics.Color color28 = color25.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color30 = color3.lerp(color28, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color35 = color30.sub((float) 16711935, (float) (short) 100, 0.0f, (-1.6947657E38f));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0.0f, (float) '4', (float) 786400, (float) (-32));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color40, (int) '#');
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color40, (-9728477));
        com.badlogic.gdx.graphics.Color color45 = color30.sub(color40);
        java.lang.String str46 = color30.toString();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "000000cc" + "'", str46, "000000cc");
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1077936368), 0, (int) (short) 0);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.useGL30;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.setWindowedMode((int) (byte) 100, 130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setsamples((-360960));
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color21 = color16.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color22 = color21.cpy();
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color22);
        java.lang.String str24 = color22.toString();
        int int25 = com.badlogic.gdx.graphics.Color.argb8888(color22);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color22;
        lwjgl3ApplicationConfiguration1.setwindowX(1071676419);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 65535 + "'", int23 == 65535);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00ffff00" + "'", str24, "00ffff00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 65535 + "'", int25 == 65535);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-864551100));
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        color1.g = (-1.4967834E38f);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        int int15 = lwjgl3ApplicationConfiguration0.g;
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-622910848));
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.windowResizable;
        lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion = 765;
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        lwjgl3ApplicationConfiguration1.r = (-8943616);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 2147483647, (-1.6473633E38f), 0.0f, 0.84313726f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4084) + "'", int4 == (-4084));
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp(1.96271E-40f, (float) (-16711936), (float) 1677721600, (float) (-41943040), (-4.319983E37f));
        com.badlogic.gdx.graphics.Color color8 = color0.set(65520);
        int int9 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        color8.a = 16711927;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, 2, 40664886);
        lwjgl3ApplicationConfiguration15.setgles30ContextMinorVersion((-2089026813));
        int int22 = lwjgl3ApplicationConfiguration15.audioDeviceBufferCount;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color15 = color10.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        color10.g = (-1.7013859E38f);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color10;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-360960);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color23.b = (-4628480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.g = (-40036);
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        lwjgl3ApplicationConfiguration18.setvSyncEnabled(false);
        boolean boolean21 = lwjgl3ApplicationConfiguration18.getuseGL30();
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color25, 16);
        color25.a = 0L;
        com.badlogic.gdx.graphics.Color color30 = color23.mul(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.stencil = 10;
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration31.initialBackgroundColor = color35;
        int int37 = com.badlogic.gdx.graphics.Color.rgb888(color35);
        boolean boolean39 = color35.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration40.initialBackgroundColor = color44;
        com.badlogic.gdx.graphics.Color color50 = color44.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color51 = color35.mul(color50);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color53 = color25.set(color52);
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration18.setwindowMinWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.stencil = 10;
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration57.initialBackgroundColor = color61;
        int int63 = com.badlogic.gdx.graphics.Color.rgb888(color61);
        boolean boolean65 = color61.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration66.stencil = 10;
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color70;
        com.badlogic.gdx.graphics.Color color76 = color70.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color77 = color61.mul(color76);
        com.badlogic.gdx.graphics.Color color78 = new com.badlogic.gdx.graphics.Color(color76);
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color76);
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color((float) (-256), (float) 6349110, (float) 40664886, (float) 'a');
        com.badlogic.gdx.graphics.Color color85 = color76.add(color84);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color85;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-157286400);
        lwjgl3ApplicationConfiguration0.stencil = 507505200;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color85);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean12 = lwjgl3ApplicationConfiguration11.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration11.getgles30ContextMinorVersion();
        int int14 = lwjgl3ApplicationConfiguration11.getwindowX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration2.stencil = 10;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color6;
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color6);
        boolean boolean10 = color6.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color22 = color6.mul(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color6);
        float float24 = color23.a;
        java.lang.String str25 = color23.toString();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((-16711681));
        com.badlogic.gdx.graphics.Color color28 = color23.add(color27);
        float float29 = color23.a;
        com.badlogic.gdx.graphics.Color color30 = color1.mul(color23);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "00000000" + "'", str25, "00000000");
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.PURPLE;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, 16);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1671024128));
        com.badlogic.gdx.graphics.Color color6 = color0.lerp(color4, 1.96271E-40f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, (-10));
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, (-16646400));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float13 = color12.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = (-447780);
        boolean boolean17 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration2.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode5 = null;
        lwjgl3ApplicationConfiguration2.fullscreenMode = lwjgl3DisplayMode5;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.stencil = 10;
        int int10 = lwjgl3ApplicationConfiguration7.b;
        boolean boolean11 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType12 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType12);
        int int14 = lwjgl3ApplicationConfiguration7.depth;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (short) 10;
        int int17 = lwjgl3ApplicationConfiguration7.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        int int21 = lwjgl3ApplicationConfiguration18.b;
        boolean boolean22 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        lwjgl3ApplicationConfiguration18.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration2.setpreferencesFileType(fileType25);
        int int28 = lwjgl3ApplicationConfiguration2.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration2.setWindowListener(lwjgl3WindowListener29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 3309388, (float) (byte) -1, 100.0f, (float) 1L);
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1621098495, (-2144), (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setsamples((-41943040));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener8);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowHeight = (-545421065);
        lwjgl3ApplicationConfiguration0.stencil = 65536;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowY(163200);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.a = 65534;
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-1233169392), (-1.0431761E38f), (float) 3371073, (float) 150929408);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.2760589E38f) + "'", float4 == (-1.2760589E38f));
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 786400, (float) (-6553036), (float) (-255), (float) (-622910848));
        com.badlogic.gdx.graphics.Color color10 = color4.lerp((float) (-15514229), (-9.071428E37f), (-1.0407874E38f), (float) (-1107701632), (float) (-65281));
        int int11 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        float float11 = color10.b;
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, 16);
        color16.a = 0L;
        com.badlogic.gdx.graphics.Color color21 = color14.mul(color16);
        com.badlogic.gdx.graphics.Color color26 = color14.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color26, 33791);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color30 = color12.sub(color29);
        com.badlogic.gdx.graphics.Color color31 = color30.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color30, 63488);
        int int34 = com.badlogic.gdx.graphics.Color.rgba4444(color30);
        com.badlogic.gdx.graphics.Color color36 = color10.lerp(color30, (float) (-16580607));
        float float37 = color30.toFloatBits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 224 + "'", int34 == 224);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 2.2775203E-38f + "'", float37 == 2.2775203E-38f);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-50331614), (float) (-33024), (float) (-537010321), (float) (-1216512000));
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        com.badlogic.gdx.graphics.Color color12 = color9.cpy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7048739 + "'", int11 == 7048739);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color4 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-251659777);
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 7712224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-29852);
        int int12 = lwjgl3ApplicationConfiguration0.b;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-29852) + "'", int13 == (-29852));
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, 2, 40664886);
        int int20 = lwjgl3ApplicationConfiguration15.a;
        int int21 = lwjgl3ApplicationConfiguration15.getwindowMinWidth();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, 16111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        lwjgl3ApplicationConfiguration0.windowMinHeight = 1677721600;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int15 = lwjgl3ApplicationConfiguration0.samples;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-648224), 536870912, (-622910848), 16738740);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-648224) + "'", int4 == (-648224));
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        float float2 = color0.b;
        com.badlogic.gdx.graphics.Color color7 = color0.set((float) 3309388, (float) 224, (float) 255, (float) 16777215);
        float float8 = color7.r;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color7, 0);
        com.badlogic.gdx.graphics.Color color15 = color7.mul((-4.6884985E37f), (float) (-33024), (float) 777825, (float) (-11241472));
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = (-4090624);
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        lwjgl3ApplicationConfiguration18.setwindowX((int) (short) 0);
        int int23 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        int int24 = lwjgl3ApplicationConfiguration18.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration26.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration26.setdisableAudio(true);
        lwjgl3ApplicationConfiguration26.windowDecorated = true;
        lwjgl3ApplicationConfiguration26.setwindowResizable(true);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration18.preferencesFileType = fileType38;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00000900", fileType38);
        int int41 = lwjgl3ApplicationConfiguration0.windowY;
        int int42 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 480 + "'", int24 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-4090624) + "'", int41 == (-4090624));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 640 + "'", int42 == 640);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.b = 512;
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color();
        int int21 = color20.toIntBits();
        int int22 = com.badlogic.gdx.graphics.Color.rgba4444(color20);
        com.badlogic.gdx.graphics.Color color24 = color19.lerp(color20, 0.0f);
        color24.r = 40664886;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color24;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        int int31 = lwjgl3ApplicationConfiguration28.depth;
        int int32 = lwjgl3ApplicationConfiguration28.stencil;
        lwjgl3ApplicationConfiguration28.gles30ContextMajorVersion = (-16580607);
        boolean boolean35 = lwjgl3ApplicationConfiguration28.disableAudio;
        com.badlogic.gdx.graphics.Color color36 = lwjgl3ApplicationConfiguration28.initialBackgroundColor;
        color36.r = (-256);
        com.badlogic.gdx.graphics.Color color39 = color24.sub(color36);
        com.badlogic.gdx.graphics.Color color45 = color24.lerp((float) 43371, (float) 65295, (float) (-1502683136), (float) (-16776961), (float) 16711935);
        color45.b = 16;
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.stencil = (-52344);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setdepth(16738740);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-208);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.stencil = (-2146830848);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-9792000), (-4201984), (-22), (-3792896), (-142049937), 587137024, (-1445928036));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 765);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener8);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(1621098495);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration1.windowWidth = (-2385);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        lwjgl3ApplicationConfiguration0.setWindowPosition(2550, (-1049600));
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        int int14 = lwjgl3ApplicationConfiguration0.a;
        int int15 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) 131090400, (float) (-3), (float) (-1728), (float) 224);
        float float6 = color5.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.7010254E38f), (float) (-1662054400), (-1.4805586E-33f), 0.0f);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color1.g = (short) -1;
        com.badlogic.gdx.graphics.Color color16 = color1.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.b;
        lwjgl3ApplicationConfiguration17.g = '#';
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration17.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color28, 16);
        color28.a = 0L;
        com.badlogic.gdx.graphics.Color color33 = color26.mul(color28);
        com.badlogic.gdx.graphics.Color color38 = color26.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color38, 33791);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color42 = color24.sub(color41);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color47, 16);
        color47.a = 0L;
        com.badlogic.gdx.graphics.Color color52 = color45.mul(color47);
        com.badlogic.gdx.graphics.Color color57 = color45.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color57, 33791);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color57);
        com.badlogic.gdx.graphics.Color color61 = color43.sub(color60);
        com.badlogic.gdx.graphics.Color color62 = color41.set(color60);
        com.badlogic.gdx.graphics.Color color63 = color62.cpy();
        com.badlogic.gdx.graphics.Color color64 = color23.set(color62);
        com.badlogic.gdx.graphics.Color color65 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color66 = color64.mul(color65);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color64, 5959695);
        com.badlogic.gdx.graphics.Color color70 = color1.lerp(color64, (-2.14741837E9f));
        com.badlogic.gdx.graphics.Color color71 = color1.cpy();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color71);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 512);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 32767);
        com.badlogic.gdx.graphics.Color color9 = color1.premultiplyAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int5 = lwjgl3ApplicationConfiguration4.getgles30ContextMinorVersion();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        lwjgl3ApplicationConfiguration4.initialBackgroundColor = color7;
        com.badlogic.gdx.graphics.Color color14 = color7.set(2.3418052E-38f, (float) (-668991488), (float) (-16730996), (float) (-1637810176));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-687865856), (float) (-67650272));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 65504, (float) (-990777344), (float) 16745216, (float) (-1201405952));
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        float float6 = color4.toFloatBits();
        java.lang.String str7 = color4.toString();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color23 = color13.lerp(color21, (float) 100L);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color29 = color23.mul(color28);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color23, (-8160));
        com.badlogic.gdx.graphics.Color color32 = color4.sub(color23);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color();
        int int34 = color33.toIntBits();
        com.badlogic.gdx.graphics.Color color39 = color33.add((-1.6950771E38f), (-1.5399916E-33f), (float) (-52344), (float) (-369098752));
        com.badlogic.gdx.graphics.Color color40 = color23.sub(color39);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00000000" + "'", str7, "00000000");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 184540928, (float) (-2147099648), 0.0f, (float) (-150));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-2023680));
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-18866176), 39951, 2147483647, 401539072);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-53504) + "'", int4 == (-53504));
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-151165028), (float) (-3232), (float) (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5610) + "'", int3 == (-5610));
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color8 = color1.lerp(color6, (float) 786400);
        int int9 = color8.toIntBits();
        float float10 = color8.b;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.NAVY;
        color11.g = (short) 10;
        com.badlogic.gdx.graphics.Color color14 = color8.add(color11);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color14, 2016);
        com.badlogic.gdx.graphics.Color color17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color19 = color14.lerp(color17, (-1.6282524E38f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65536) + "'", int9 == (-65536));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowX();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((-458762));
        int int12 = lwjgl3ApplicationConfiguration7.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration7.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration7.g = 507505200;
        java.lang.String str17 = lwjgl3ApplicationConfiguration7.preferencesDirectory;
        java.lang.String str18 = lwjgl3ApplicationConfiguration7.title;
        int int19 = lwjgl3ApplicationConfiguration7.getwindowWidth();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 640 + "'", int19 == 640);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((-1.0632526E37f), (float) 765, (float) (-8607));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4609) + "'", int3 == (-4609));
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.windowWidth = (-587202560);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 'a', (float) (-164075620), (float) 32256, (float) 65536);
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = color23.mul(1.0f, (float) 43371, (float) (-4089), (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color30 = color23.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) (-2105736960), (-1.1841958E21f), (float) 43371, (float) (-116));
        color30.g = (-48896);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (int) (byte) 0);
        color4.a = 16711935;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        int int16 = lwjgl3ApplicationConfiguration13.depth;
        int int17 = lwjgl3ApplicationConfiguration13.stencil;
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = (-16580607);
        boolean boolean20 = lwjgl3ApplicationConfiguration13.disableAudio;
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        color21.r = (-256);
        com.badlogic.gdx.graphics.Color color25 = color4.lerp(color21, (-1.7008689E38f));
        com.badlogic.gdx.graphics.Color color26 = color21.cpy();
        int int27 = com.badlogic.gdx.graphics.Color.rgb565(color26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-16252195) + "'", int27 == (-16252195));
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str41 = lwjgl3ApplicationConfiguration1.title;
        int int42 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        int int43 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration44.setResizable(true);
        lwjgl3ApplicationConfiguration44.samples = 65295;
        lwjgl3ApplicationConfiguration44.setWindowedMode((-905969664), (-8303));
        lwjgl3ApplicationConfiguration44.setpreferencesDirectory("ff7b0000");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(9.1655E-41f, (float) 640, 2.3418052E-38f, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2457600 + "'", int4 == 2457600);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setdepth(50331648);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 16);
        color4.a = 0L;
        com.badlogic.gdx.graphics.Color color9 = color2.mul(color4);
        com.badlogic.gdx.graphics.Color color14 = color2.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color14, 33791);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color18 = color0.sub(color17);
        com.badlogic.gdx.graphics.Color color19 = color18.cpy();
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color24, 16);
        color24.a = 0L;
        com.badlogic.gdx.graphics.Color color29 = color22.mul(color24);
        com.badlogic.gdx.graphics.Color color34 = color22.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, 33791);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color34);
        com.badlogic.gdx.graphics.Color color38 = color20.sub(color37);
        com.badlogic.gdx.graphics.Color color39 = color38.clamp();
        float float40 = color38.a;
        com.badlogic.gdx.graphics.Color color41 = color19.add(color38);
        float float42 = color41.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType10);
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertNull(fileType13);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1310975, (float) (-1728), (float) (-266942944), (float) (-990777344));
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.depth = 765;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color14 = color9.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color15 = color14.cpy();
        int int16 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        java.lang.String str17 = color15.toString();
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        float float19 = color15.r;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color15;
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65535 + "'", int16 == 65535);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "00ffff00" + "'", str17, "00ffff00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65535 + "'", int18 == 65535);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration10.windowListener;
        int int14 = lwjgl3ApplicationConfiguration10.getsamples();
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00000000", fileType15);
        int int18 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        int int19 = lwjgl3ApplicationConfiguration1.getsamples();
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-142049825));
        int int13 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color11 = color6.sub((float) 585070592, (-1.6473113E38f), (float) (-64), (float) 9);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(50331648);
        com.badlogic.gdx.graphics.Color color14 = color6.set(color13);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color14, (-62876));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        int int25 = lwjgl3ApplicationConfiguration22.depth;
        int int26 = lwjgl3ApplicationConfiguration22.stencil;
        int int27 = lwjgl3ApplicationConfiguration22.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration22.hdpiMode = hdpiMode30;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode30;
        java.lang.String str33 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ".prefs/" + "'", str33, ".prefs/");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (byte) 0, 0.9843137f, (float) 51855, (float) 1929379839);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, 16);
        color26.a = 0L;
        com.badlogic.gdx.graphics.Color color31 = color24.mul(color26);
        com.badlogic.gdx.graphics.Color color36 = color24.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color36, 33791);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color36);
        com.badlogic.gdx.graphics.Color color40 = color22.sub(color39);
        com.badlogic.gdx.graphics.Color color41 = color40.clamp();
        boolean boolean42 = color21.equals((java.lang.Object) color40);
        int int43 = com.badlogic.gdx.graphics.Color.rgba4444(color21);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        lwjgl3ApplicationConfiguration0.b = (-100466688);
        lwjgl3ApplicationConfiguration0.setAudioConfig(255, 1, 3);
        lwjgl3ApplicationConfiguration0.setTitle("000000ff");
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) 1, 0.516129f, (float) 1, (float) (-85504));
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 491505, (float) 33021, (float) 18005600, (float) 131090400);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, 1967136);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        int int29 = com.badlogic.gdx.graphics.Color.rgb888(color27);
        boolean boolean31 = color27.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration32.initialBackgroundColor = color36;
        com.badlogic.gdx.graphics.Color color42 = color36.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color43 = color27.mul(color42);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color42);
        float float45 = color44.toFloatBits();
        com.badlogic.gdx.graphics.Color color46 = color4.mul(color44);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 2.3509886E-38f + "'", float45 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        int int3 = com.badlogic.gdx.graphics.Color.rgba8888(color2);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int26 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-4090624));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2147483647, (float) (-256), (float) (-2147413088), (float) '#');
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        boolean boolean12 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion = (-15);
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (-16654816), (-7936));
        boolean boolean19 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.setBackBufferConfig(7048739, (-810483712), 16777215, 52625, (-276908320), 0, 483965280);
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-545421065));
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setWindowPosition(8925, (-5543167));
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.g;
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration10.windowWidth = (-1074216555);
        int int16 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-327680), (-2070550656));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-553651968));
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        int int10 = color9.toIntBits();
        com.badlogic.gdx.graphics.Color color12 = color1.lerp(color9, (float) (-1286733314));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16711680 + "'", int10 == 16711680);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) (-66797), (-1.1841958E21f), (float) 536867136);
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.stencil = 10;
        lwjgl3ApplicationConfiguration6.setwindowX((int) (short) 0);
        int int11 = lwjgl3ApplicationConfiguration6.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration6.disableAudio(true);
        lwjgl3ApplicationConfiguration6.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        int int17 = lwjgl3ApplicationConfiguration16.g;
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color19 = color4.sub(color18);
        int int20 = com.badlogic.gdx.graphics.Color.rgb565(color19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 63488 + "'", int20 == 63488);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-2140955648), 572710365, (-16646400), (-1396305920));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7005032E38f) + "'", float4 == (-1.7005032E38f));
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        int int15 = com.badlogic.gdx.graphics.Color.rgb888(color13);
        boolean boolean17 = color13.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color29 = color13.mul(color28);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color31 = color3.set(color30);
        float float32 = color31.b;
        com.badlogic.gdx.graphics.Color color33 = color31.clamp();
        int int34 = com.badlogic.gdx.graphics.Color.argb8888(color31);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16777215 + "'", int34 == 16777215);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 509920;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        int int19 = lwjgl3ApplicationConfiguration15.stencil;
        int int20 = lwjgl3ApplicationConfiguration15.getwindowY();
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration0.a = 537535241;
        int int37 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration2);
        lwjgl3ApplicationConfiguration3.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getuseGL30();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, 16);
        color10.a = 0L;
        com.badlogic.gdx.graphics.Color color15 = color8.mul(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color20;
        int int22 = com.badlogic.gdx.graphics.Color.rgb888(color20);
        boolean boolean24 = color20.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color29;
        com.badlogic.gdx.graphics.Color color35 = color29.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color36 = color20.mul(color35);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color38 = color10.set(color37);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color40 = color1.add(color38);
        com.badlogic.gdx.graphics.Color color45 = color38.mul((float) 640, (float) (-2147418368), (float) 100, (float) (-52344));
        com.badlogic.gdx.graphics.Color color50 = color38.set((float) 634911, 0.0f, 0.0f, (float) (-2147413088));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color50, 54);
        com.badlogic.gdx.graphics.Color color54 = color50.set((-57968640));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color54);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        lwjgl3ApplicationConfiguration0.setdepth(862994742);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setdepth(130029600);
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int18 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-4089), (float) (-62876), (float) (-864551100), (float) (-16711681));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, (-2320));
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        int int6 = lwjgl3ApplicationConfiguration3.depth;
        int int7 = lwjgl3ApplicationConfiguration3.stencil;
        lwjgl3ApplicationConfiguration3.gles30ContextMajorVersion = (-16580607);
        boolean boolean10 = lwjgl3ApplicationConfiguration3.disableAudio;
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration3.initialBackgroundColor;
        color11.g = (-1.7013599E38f);
        com.badlogic.gdx.graphics.Color color18 = color11.add((float) 40664886, (float) 1621098495, (float) 0L, (float) (-864551100));
        com.badlogic.gdx.graphics.Color color23 = color11.mul((-1.7013599E38f), (-1.1841958E21f), (float) 480, (float) 514080);
        com.badlogic.gdx.graphics.Color color24 = color1.sub(color23);
        com.badlogic.gdx.graphics.Color color29 = color24.set((-1.4967834E38f), (float) 586415136, (float) (-16580607), (float) 8925);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color35 = color30.add((-4.997535E37f), (float) 150, (float) 372608, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color36 = color30.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration10.setdisableAudio(false);
        int int13 = lwjgl3ApplicationConfiguration10.getwindowWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowDecorated = false;
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-848128);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        java.lang.String str5 = lwjgl3ApplicationConfiguration1.title;
        int int6 = lwjgl3ApplicationConfiguration1.a;
        int int7 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.setwindowX(30696);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType10);
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((-41943040));
        lwjgl3ApplicationConfiguration0.setTitle("ff0000ff");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 31, (float) 63151, (float) 63518, (float) 130029600);
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) 6349110, 0.0f, (float) (byte) 0, (float) 1);
        com.badlogic.gdx.graphics.Color color7 = color0.sub(color6);
        color0.r = (-2147099648);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16738740);
        int int2 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3946 + "'", int2 == 3946);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 579543807, 1.3929654E15f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.setwindowX((-76353280));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration5.samples;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources((-59475968));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.b = 537535241;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-250615296));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) 0L, (float) 640, (float) ' ', (float) (-1));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color13 = color1.set(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        float float36 = color35.toFloatBits();
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color45 = color38.lerp(color43, (float) 786400);
        int int46 = color45.toIntBits();
        float float47 = color45.b;
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.NAVY;
        color48.g = (short) 10;
        com.badlogic.gdx.graphics.Color color51 = color45.add(color48);
        com.badlogic.gdx.graphics.Color color53 = color35.lerp(color51, (float) 1L);
        com.badlogic.gdx.graphics.Color color54 = color12.add(color53);
        int int55 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 2.3509886E-38f + "'", float36 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-65536) + "'", int46 == (-65536));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 65535 + "'", int55 == 65535);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        lwjgl3ApplicationConfiguration0.windowMinHeight = 16;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-16738848), (-1.7013966E38f), (float) 862994742);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration12.setwindowResizable(false);
        lwjgl3ApplicationConfiguration12.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion = 0;
        int int27 = lwjgl3ApplicationConfiguration12.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        int int29 = lwjgl3ApplicationConfiguration12.depth;
        lwjgl3ApplicationConfiguration12.useGL30 = false;
        lwjgl3ApplicationConfiguration12.windowResizable = false;
        com.badlogic.gdx.graphics.Color color34 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.stencil = 10;
        lwjgl3ApplicationConfiguration35.setwindowX((int) (short) 0);
        int int40 = lwjgl3ApplicationConfiguration35.getaudioDeviceBufferSize();
        int int41 = lwjgl3ApplicationConfiguration35.b;
        boolean boolean42 = lwjgl3ApplicationConfiguration35.getwindowResizable();
        lwjgl3ApplicationConfiguration35.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration35.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration35);
        java.lang.String str48 = lwjgl3ApplicationConfiguration47.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        lwjgl3ApplicationConfiguration49.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration49.vSyncEnabled = true;
        int int58 = lwjgl3ApplicationConfiguration49.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType59 = lwjgl3ApplicationConfiguration49.preferencesFileType;
        lwjgl3ApplicationConfiguration47.preferencesFileType = fileType59;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType59);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType59);
        java.lang.Class<?> wildcardClass63 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ".prefs/" + "'", str48, ".prefs/");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 16 + "'", int58 == 16);
        org.junit.Assert.assertTrue("'" + fileType59 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType59.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        int int9 = lwjgl3ApplicationConfiguration1.windowY;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.a = (-251659777);
        boolean boolean13 = lwjgl3ApplicationConfiguration1.useGL30;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        lwjgl3ApplicationConfiguration24.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color32;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        com.badlogic.gdx.graphics.Color color44 = color38.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color48 = color38.lerp(color46, (float) 100L);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration49);
        lwjgl3ApplicationConfiguration50.setvSyncEnabled(false);
        boolean boolean53 = lwjgl3ApplicationConfiguration50.getuseGL30();
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color57, 16);
        color57.a = 0L;
        com.badlogic.gdx.graphics.Color color62 = color55.mul(color57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.stencil = 10;
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration63.initialBackgroundColor = color67;
        int int69 = com.badlogic.gdx.graphics.Color.rgb888(color67);
        boolean boolean71 = color67.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration72.stencil = 10;
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration72.initialBackgroundColor = color76;
        com.badlogic.gdx.graphics.Color color82 = color76.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color83 = color67.mul(color82);
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color(color82);
        com.badlogic.gdx.graphics.Color color85 = color57.set(color84);
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color85);
        com.badlogic.gdx.graphics.Color color87 = color48.sub(color85);
        com.badlogic.gdx.graphics.Color color89 = color32.lerp(color48, 100.0f);
        com.badlogic.gdx.graphics.Color color90 = new com.badlogic.gdx.graphics.Color(color89);
        com.badlogic.gdx.graphics.Color color92 = color22.lerp(color90, (float) (-255));
        int int93 = com.badlogic.gdx.graphics.Color.rgb565(color22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 65535 + "'", int93 == 65535);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration17.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        int int28 = lwjgl3ApplicationConfiguration17.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration17.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        boolean boolean34 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.b = (-369098752);
        int int37 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1071676419, (-16776961), (-51766), 39951, (-2063361), (-658939904), (-43264));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 640 + "'", int37 == 640);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration2.getwindowY();
        int int4 = lwjgl3ApplicationConfiguration2.audioDeviceBufferCount;
        java.lang.String str5 = lwjgl3ApplicationConfiguration2.preferencesDirectory;
        lwjgl3ApplicationConfiguration2.setvSyncEnabled(false);
        boolean boolean8 = lwjgl3ApplicationConfiguration2.useGL30;
        lwjgl3ApplicationConfiguration2.windowMaxHeight = 2097152;
        lwjgl3ApplicationConfiguration2.setwindowY(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (-9.29437E37f), 1.04539595E-8f, (float) (-16842496));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-8.506964E37f), (float) (-16730996), (float) 16754175, 0.25490198f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-272646397) + "'", int4 == (-272646397));
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        color0.a = (short) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int12 = lwjgl3ApplicationConfiguration3.gles30ContextMajorVersion;
        int int13 = lwjgl3ApplicationConfiguration3.getgles30ContextMajorVersion();
        int int14 = lwjgl3ApplicationConfiguration3.getsamples();
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration3.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color15, 65295);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color19 = color0.sub(color18);
        float float20 = color19.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16777200, (float) (-9728477), (float) (-67168768), (float) (-220));
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 514080, (float) (-14816), 0.0f, (float) 301989632);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-545421065));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color14;
        int int16 = com.badlogic.gdx.graphics.Color.rgb888(color14);
        boolean boolean18 = color14.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color23;
        com.badlogic.gdx.graphics.Color color29 = color23.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color30 = color14.mul(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color29);
        float float32 = color31.r;
        com.badlogic.gdx.graphics.Color color33 = color9.mul(color31);
        java.lang.String str34 = color33.toString();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00008300" + "'", str34, "00008300");
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        int int12 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        lwjgl3ApplicationConfiguration1.setsamples((-620849664));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(862994742);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color15 = color10.lerp(color12, (float) (-5543167));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color12, (-535758336));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        java.lang.String str5 = lwjgl3ApplicationConfiguration1.title;
        int int6 = lwjgl3ApplicationConfiguration1.a;
        int int7 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-80712576);
        boolean boolean12 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-2144), (float) (-52344));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4426632) + "'", int2 == (-4426632));
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = (-1047005184);
        lwjgl3ApplicationConfiguration0.windowX = 5959695;
        int int17 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5959695 + "'", int17 == 5959695);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdepth((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration1.windowMinWidth = 553648000;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 63518;
        lwjgl3ApplicationConfiguration1.stencil = 130029600;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-150));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        int int14 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.windowMaxHeight = (byte) -1;
        boolean boolean18 = lwjgl3ApplicationConfiguration15.disableAudio;
        lwjgl3ApplicationConfiguration15.setwindowHeight((-10));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color31 = color25.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color36 = color25.mul((float) '#', (float) (-10223606), (float) (-545421065), (float) 3309388);
        int int37 = com.badlogic.gdx.graphics.Color.rgb565(color36);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color36;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        int int40 = lwjgl3ApplicationConfiguration1.windowHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 63488 + "'", int37 == 63488);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 480 + "'", int40 == 480);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setdepth((-15514229));
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.title;
        int int16 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1077936368), (float) 2, (float) (-1948738560), (float) 3);
        float float5 = color4.r;
        com.badlogic.gdx.graphics.Color color11 = color4.lerp((float) (-654724064), (-1.6473633E38f), (float) 65280, (float) 25500, (float) 167772160);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(33152, (-18866176), (-151125872), (-33024));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.017487E20f) + "'", float4 == (-1.017487E20f));
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.windowWidth = 1621098495;
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 28901;
        int int19 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 28901 + "'", int19 == 28901);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 102, 0.2f, (-0.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1704604416 + "'", int3 == 1704604416);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = lwjgl3ApplicationConfiguration0.windowListener;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertNull(lwjgl3WindowListener11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-199756800), (float) 2146972160, (float) (-2096826780), (float) 16776960);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-256) + "'", int4 == (-256));
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-256.0f), 1.96271E-40f, (-0.36354828f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-92) + "'", int3 == (-92));
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setdepth(16738740);
        lwjgl3ApplicationConfiguration0.b = 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 40664886;
        lwjgl3ApplicationConfiguration0.samples = 0;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowHeight = 2113863936;
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration4.stencil = 10;
        int int7 = lwjgl3ApplicationConfiguration4.b;
        boolean boolean8 = lwjgl3ApplicationConfiguration4.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration4.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType9;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.samples = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((int) (short) 0);
        lwjgl3ApplicationConfiguration7.g = (-52344);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.9411765f, (-1.7013859E38f), (float) 52625, (float) 52);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        int int8 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration11.samples = (short) -1;
        lwjgl3ApplicationConfiguration11.title = ".prefs/";
        int int23 = lwjgl3ApplicationConfiguration11.windowMaxWidth;
        int int24 = lwjgl3ApplicationConfiguration11.windowY;
        lwjgl3ApplicationConfiguration11.setwindowY(1621098495);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode27 = lwjgl3ApplicationConfiguration11.fullscreenMode;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType28;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode27);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-40036), (float) (-1630253056), (float) (-2146830848), (-1.6731361E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-469762048) + "'", int4 == (-469762048));
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        color0.g = (short) 10;
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.CYAN;
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(color3);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color7 = color0.lerp(color3, 0.06666667f);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color7, (-990777344));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) '4', (float) 786400, (float) (-32));
        float float5 = color4.b;
        int int6 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4080 + "'", int6 == 4080);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean3 = lwjgl3ApplicationConfiguration2.getdisableAudio();
        int int4 = lwjgl3ApplicationConfiguration2.gles30ContextMajorVersion;
        boolean boolean5 = lwjgl3ApplicationConfiguration2.vSyncEnabled;
        lwjgl3ApplicationConfiguration2.setAudioConfig((-2147418368), 650565, 11059605);
        lwjgl3ApplicationConfiguration2.audioDeviceSimultaneousSources = (-1972440832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SKY;
        color0.g = 0L;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, 16);
        color6.a = 0L;
        com.badlogic.gdx.graphics.Color color11 = color4.mul(color6);
        com.badlogic.gdx.graphics.Color color16 = color4.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        boolean boolean18 = color16.equals((java.lang.Object) (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color23 = color16.mul((float) 537535241, (float) 9, (float) (-16711681), (float) (-40036));
        int int24 = com.badlogic.gdx.graphics.Color.rgba8888(color16);
        com.badlogic.gdx.graphics.Color color26 = color0.lerp(color16, (float) 63488);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color16, (-2096826780));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.g;
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) (-5898496), (float) 2560, (float) 63232, (-1.7005584E38f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-29852);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        int int14 = lwjgl3ApplicationConfiguration0.samples;
        int int15 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 16);
        color4.a = 0L;
        com.badlogic.gdx.graphics.Color color9 = color2.mul(color4);
        com.badlogic.gdx.graphics.Color color14 = color2.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color14, 33791);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color18 = color0.sub(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 16);
        color23.a = 0L;
        com.badlogic.gdx.graphics.Color color28 = color21.mul(color23);
        com.badlogic.gdx.graphics.Color color33 = color21.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, 33791);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color37 = color19.sub(color36);
        com.badlogic.gdx.graphics.Color color38 = color17.set(color36);
        com.badlogic.gdx.graphics.Color color39 = color36.cpy();
        color36.a = (-251658240);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-545421065));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        java.lang.String str19 = lwjgl3ApplicationConfiguration15.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        com.badlogic.gdx.graphics.Color color30 = color24.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color24, (int) (byte) 1);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color24;
        boolean boolean34 = lwjgl3ApplicationConfiguration15.windowDecorated;
        lwjgl3ApplicationConfiguration15.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration15.setpreferencesDirectory("");
        int int41 = lwjgl3ApplicationConfiguration15.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode42;
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode42 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode42.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = color23.mul(1.0f, (float) 43371, (float) (-4089), (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color28, 267782144);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color34, 16);
        color34.a = 0L;
        com.badlogic.gdx.graphics.Color color39 = color32.mul(color34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration40.initialBackgroundColor = color44;
        int int46 = com.badlogic.gdx.graphics.Color.rgb888(color44);
        boolean boolean48 = color44.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration49.initialBackgroundColor = color53;
        com.badlogic.gdx.graphics.Color color59 = color53.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color60 = color44.mul(color59);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color59);
        com.badlogic.gdx.graphics.Color color62 = color34.set(color61);
        float float63 = color62.b;
        com.badlogic.gdx.graphics.Color color64 = com.badlogic.gdx.graphics.Color.FOREST;
        com.badlogic.gdx.graphics.Color color65 = color62.set(color64);
        com.badlogic.gdx.graphics.Color color67 = color28.lerp(color64, (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color68 = color64.cpy();
        int int69 = com.badlogic.gdx.graphics.Color.rgba4444(color68);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 1.0f + "'", float63 == 1.0f);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10287 + "'", int69 == 10287);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 63488, (float) (-1047005184), (float) 7680, (float) 16738740);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, (-1888288));
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int5 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".prefs/" + "'", str4, ".prefs/");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1704604416, 0, (-545421065), (-1637810176), 136, 765);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        int int6 = lwjgl3ApplicationConfiguration3.depth;
        int int7 = lwjgl3ApplicationConfiguration3.stencil;
        lwjgl3ApplicationConfiguration3.gles30ContextMajorVersion = (-16580607);
        boolean boolean10 = lwjgl3ApplicationConfiguration3.disableAudio;
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration3.initialBackgroundColor;
        color11.g = (-1.7013599E38f);
        com.badlogic.gdx.graphics.Color color18 = color11.add((float) 40664886, (float) 1621098495, (float) 0L, (float) (-864551100));
        com.badlogic.gdx.graphics.Color color23 = color11.mul((-1.7013599E38f), (-1.1841958E21f), (float) 480, (float) 514080);
        com.badlogic.gdx.graphics.Color color24 = color1.sub(color23);
        com.badlogic.gdx.graphics.Color color29 = color23.mul((float) (-2089026813), (float) (-164075620), (float) (-2147099648), (float) 2147483647);
        int int30 = color29.toIntBits();
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color36 = color31.sub((-1.7010254E38f), (float) (-138042720), (float) 20191, 0.0f);
        color31.g = (-1.7007336E38f);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode13);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-4090624);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(9, (-2130706432), (-237), (-50331614), (-16777116), 1897903, (-157286400));
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 3211264;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int15 = lwjgl3ApplicationConfiguration0.windowX;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.7005698E38f), (float) 254, (float) (-321707263));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2130902528) + "'", int3 == (-2130902528));
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int17 = lwjgl3ApplicationConfiguration0.a;
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        boolean boolean16 = lwjgl3ApplicationConfiguration15.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.stencil = 1677721600;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.stencil = (-983040);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2147418368), (float) (-151125872), (float) 63232, 0.003921569f);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-67650272), (float) 46220, (float) (-43264), (float) 117436161);
        color4.g = (-1.2760589E38f);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SLATE;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) 9, (float) (byte) 10, (float) 0, 0.0f);
        int int6 = color0.toIntBits();
        float float7 = color0.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 65535 + "'", int6 == 65535);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("000000cc");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.title = "ff000000";
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-16722017), 0.9047619f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.setwindowY((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 16711680, (-864551100));
        lwjgl3ApplicationConfiguration1.windowWidth = 'a';
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color27, 16);
        color27.a = 0L;
        com.badlogic.gdx.graphics.Color color32 = color25.mul(color27);
        com.badlogic.gdx.graphics.Color color37 = color25.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color37, 33791);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color41 = color23.sub(color40);
        int int42 = com.badlogic.gdx.graphics.Color.rgba4444(color41);
        com.badlogic.gdx.graphics.Color color44 = color4.lerp(color41, (float) (-503341578));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (-864551100));
        float float47 = color4.a;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.8f + "'", float47 == 0.8f);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(117436161);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration9.windowResizable = false;
        boolean boolean12 = lwjgl3ApplicationConfiguration9.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLUE;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color2 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-237));
        com.badlogic.gdx.graphics.Color color7 = color0.mul(color6);
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.a = 2016;
        lwjgl3ApplicationConfiguration0.b = (-458762);
        int int19 = lwjgl3ApplicationConfiguration0.r;
        int int20 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration21.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2016 + "'", int20 == 2016);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.setWindowedMode((int) (byte) 100, 130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setsamples((-360960));
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color21 = color16.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color22 = color21.cpy();
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color22);
        java.lang.String str24 = color22.toString();
        int int25 = com.badlogic.gdx.graphics.Color.argb8888(color22);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color22;
        lwjgl3ApplicationConfiguration1.setdepth(65295);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 65535 + "'", int23 == 65535);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00ffff00" + "'", str24, "00ffff00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 65535 + "'", int25 == 65535);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int11 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 61440;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(43371, 1157627903, 615183, 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013967E38f) + "'", float4 == (-1.7013967E38f));
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.windowX = 62445;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-16654816), (float) (-250615296), (float) 117436161, (float) (-6553036));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6947657E38f) + "'", float4 == (-1.6947657E38f));
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setwindowX((int) (short) -1);
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        int int8 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.setwindowMinWidth((-22978560));
        int int11 = lwjgl3ApplicationConfiguration1.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-15);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff0000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 640, 1465382614);
        lwjgl3ApplicationConfiguration1.setuseGL30(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-5543167));
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(3.57E-43f, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-47424), (-8192000), (-270575616), (-1636));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6966025E38f) + "'", float4 == (-1.6966025E38f));
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color4);
        float float22 = color21.a;
        java.lang.String str23 = color21.toString();
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((-16711681));
        com.badlogic.gdx.graphics.Color color26 = color21.add(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color31;
        int int33 = com.badlogic.gdx.graphics.Color.rgb888(color31);
        boolean boolean35 = color31.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color40;
        com.badlogic.gdx.graphics.Color color46 = color40.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color47 = color31.mul(color46);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color31);
        float float49 = color48.a;
        com.badlogic.gdx.graphics.Color color54 = color48.add(1.0f, (float) 10L, 0.0f, (float) 6349110);
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color56, 16);
        float float59 = color56.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color56, 512);
        int int62 = com.badlogic.gdx.graphics.Color.rgb565(color56);
        com.badlogic.gdx.graphics.Color color63 = color56.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color56, (-622910848));
        com.badlogic.gdx.graphics.Color color66 = color48.sub(color56);
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(color48);
        com.badlogic.gdx.graphics.Color color69 = color26.lerp(color48, (float) (-1478332187));
        com.badlogic.gdx.graphics.Color color70 = color48.cpy();
        int int71 = com.badlogic.gdx.graphics.Color.rgb888(color48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2088192 + "'", int71 == 2088192);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        lwjgl3ApplicationConfiguration1.depth = 50331648;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setsamples((-1445928036));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color1);
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color9 = color6.mul((float) (short) 0);
        color9.r = 25500;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color9, (-99160321));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33791 + "'", int5 == 33791);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-15514229);
        lwjgl3ApplicationConfiguration0.windowY = (short) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        int int11 = lwjgl3ApplicationConfiguration8.depth;
        lwjgl3ApplicationConfiguration8.windowX = (short) 100;
        lwjgl3ApplicationConfiguration8.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("d2b48cff", fileType17);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-3060), (-52344));
        lwjgl3ApplicationConfiguration0.b = (-369098752);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int10 = lwjgl3ApplicationConfiguration1.g;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.title;
        int int12 = lwjgl3ApplicationConfiguration1.r;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = (-164075620);
        lwjgl3ApplicationConfiguration1.a = (-1077936368);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.title = ".prefs/";
        lwjgl3ApplicationConfiguration1.setwindowHeight((-10));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int9 = lwjgl3ApplicationConfiguration8.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        int int1 = com.badlogic.gdx.graphics.Color.alpha(2.927973E-39f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.windowResizable;
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        int int7 = lwjgl3ApplicationConfiguration1.windowWidth;
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, (-225), 1071676419);
        boolean boolean15 = lwjgl3ApplicationConfiguration1.useGL30;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        float float1 = color0.toFloatBits();
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.2535296E37f) + "'", float1 == (-4.2535296E37f));
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.windowHeight = 765;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setWindowedMode(40664886, 3309388);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2147418367;
        int int12 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration1.disableAudio;
        int int15 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = lwjgl3ApplicationConfiguration1.windowListener;
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-8943616));
        int int19 = lwjgl3ApplicationConfiguration1.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color15 = color10.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        color10.g = (-1.7013859E38f);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color10;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-360960);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-545421065));
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration1.setdepth((-41943040));
        lwjgl3ApplicationConfiguration1.title = "";
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(63488);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str25 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int27 = lwjgl3ApplicationConfiguration1.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".prefs/" + "'", str25, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.depth;
        lwjgl3ApplicationConfiguration17.windowX = (short) 100;
        lwjgl3ApplicationConfiguration17.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        int int27 = lwjgl3ApplicationConfiguration17.getwindowY();
        lwjgl3ApplicationConfiguration17.samples = 512;
        com.badlogic.gdx.graphics.Color color30 = lwjgl3ApplicationConfiguration17.initialBackgroundColor;
        int int31 = lwjgl3ApplicationConfiguration17.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = lwjgl3ApplicationConfiguration17.hdpiMode;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode32);
        boolean boolean34 = lwjgl3ApplicationConfiguration16.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color4);
        float float22 = color21.a;
        float float23 = color21.r;
        float float24 = color21.toFloatBits();
        float float25 = color21.toFloatBits();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = color23.mul(1.0f, (float) 43371, (float) (-4089), (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color28, 267782144);
        com.badlogic.gdx.graphics.Color color36 = color28.lerp((-1.3606088E22f), (float) (-276908320), (-3.915235E-31f), (float) (-9728477), (float) (-16580607));
        com.badlogic.gdx.graphics.Color color37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color38 = color28.set(color37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 3371073, (float) 640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1020460416 + "'", int2 == 1020460416);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-545421065));
        int int17 = color14.toIntBits();
        com.badlogic.gdx.graphics.Color color18 = color14.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color23 = color14.mul(0.0f, (float) (-844509056), 2.3418052E-38f, 0.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-142049825) + "'", int17 == (-142049825));
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setsamples((-545421065));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(224);
        float float11 = color10.r;
        com.badlogic.gdx.graphics.Color color13 = color10.set((-1077936368));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-16777085);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 862994742;
        int int10 = lwjgl3ApplicationConfiguration1.r;
        int int11 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int14 = lwjgl3ApplicationConfiguration13.getwindowY();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str41 = lwjgl3ApplicationConfiguration1.title;
        int int42 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        com.badlogic.gdx.graphics.Color color43 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        int int44 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 640 + "'", int42 == 640);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setdepth(0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        int int6 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowX();
        int int8 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-45312), (float) 4080, (float) (-15), (float) 514080);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) '4');
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (-100466688));
        com.badlogic.gdx.graphics.Color color9 = color4.mul(color6);
        float float10 = color4.a;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.98039216f + "'", float10 == 0.98039216f);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(1465382614);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount(2135687168);
        int int5 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int6 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2135687168 + "'", int6 == 2135687168);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-637684704));
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (-7555886), (float) 1769996257, (float) (-10188800), (float) 537535241, (float) 65280);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration9.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration9.setsamples((int) (byte) 10);
        int int15 = lwjgl3ApplicationConfiguration9.getaudioDeviceBufferCount();
        java.lang.String str16 = lwjgl3ApplicationConfiguration9.title;
        lwjgl3ApplicationConfiguration9.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration9.b = '#';
        int int23 = lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion;
        boolean boolean24 = color7.equals((java.lang.Object) lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.r = (-10);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.useGL30;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 63232, (float) (-1972440832), (float) (-548854), (float) (-47424));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 9.2949454E24f + "'", float4 == 9.2949454E24f);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int8 = lwjgl3ApplicationConfiguration0.b;
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdepth((-29852));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener8;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-10), 0);
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.g = 1621098495;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color32, 16);
        color32.a = 0L;
        com.badlogic.gdx.graphics.Color color37 = color30.mul(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color42;
        int int44 = com.badlogic.gdx.graphics.Color.rgb888(color42);
        boolean boolean46 = color42.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.stencil = 10;
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration47.initialBackgroundColor = color51;
        com.badlogic.gdx.graphics.Color color57 = color51.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color58 = color42.mul(color57);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(color57);
        com.badlogic.gdx.graphics.Color color60 = color32.set(color59);
        com.badlogic.gdx.graphics.Color color61 = color28.set(color59);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color61, 10);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color61;
        int int65 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int66 = lwjgl3ApplicationConfiguration0.windowX;
        int int67 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.setTitle("0000fb12");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 512 + "'", int65 == 512);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float5 = color4.a;
        float float6 = color4.g;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        int int18 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-52320), (float) (-14483712), (float) (-16730996), (float) (-33584897));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-536870912) + "'", int4 == (-536870912));
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) (-447780), (float) (-1047005184), (-9.238233E37f), 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color19;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.windowY = 586415136;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration10.windowListener;
        int int14 = lwjgl3ApplicationConfiguration10.getsamples();
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00000000", fileType15);
        int int18 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration21.preferencesDirectory = "000000cc";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration40.initialBackgroundColor = color44;
        int int46 = com.badlogic.gdx.graphics.Color.rgb888(color44);
        boolean boolean48 = color44.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration49.initialBackgroundColor = color53;
        com.badlogic.gdx.graphics.Color color59 = color53.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color60 = color44.mul(color59);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color59);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener63 = lwjgl3ApplicationConfiguration1.windowListener;
        int int64 = lwjgl3ApplicationConfiguration1.windowY;
        boolean boolean65 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNull(lwjgl3WindowListener63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 131072, (float) 150929588, (float) (-16580607), (float) (-1413507584));
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 40704, (float) (-32160), 0.039215688f, (float) (-16654816));
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        boolean boolean16 = lwjgl3ApplicationConfiguration15.windowDecorated;
        lwjgl3ApplicationConfiguration15.setuseGL30(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color4);
        float float22 = color21.a;
        float float23 = color21.r;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color29 = color24.mul((float) 267782144, (float) (byte) 1, (float) 40664886, 1.0f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color34;
        int int36 = com.badlogic.gdx.graphics.Color.rgb888(color34);
        boolean boolean38 = color34.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration39.initialBackgroundColor = color43;
        com.badlogic.gdx.graphics.Color color49 = color43.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color50 = color34.mul(color49);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color49);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color53 = color29.mul(color52);
        color29.a = (-1);
        float float56 = color29.r;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(33791);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration15.audioDeviceSimultaneousSources = (-2140996640);
        boolean boolean18 = lwjgl3ApplicationConfiguration15.disableAudio;
        int int19 = lwjgl3ApplicationConfiguration15.b;
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        int int22 = lwjgl3ApplicationConfiguration15.audioDeviceBufferSize;
        int int23 = lwjgl3ApplicationConfiguration15.getwindowY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 512);
        int int7 = color1.toIntBits();
        java.lang.String str8 = color1.toString();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        lwjgl3ApplicationConfiguration9.b = (byte) 0;
        lwjgl3ApplicationConfiguration9.setwindowResizable(true);
        lwjgl3ApplicationConfiguration9.setWindowedMode(0, 0);
        lwjgl3ApplicationConfiguration9.setaudioDeviceBufferCount((-65280));
        int int24 = lwjgl3ApplicationConfiguration9.getwindowHeight();
        lwjgl3ApplicationConfiguration9.depth = 32256;
        lwjgl3ApplicationConfiguration9.setgles30ContextMajorVersion((-551618560));
        boolean boolean29 = color1.equals((java.lang.Object) (-551618560));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 131072 + "'", int7 == 131072);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000200" + "'", str8, "00000200");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color15 = color1.set((int) (byte) -1);
        float float16 = color15.r;
        com.badlogic.gdx.graphics.Color color18 = color15.mul((float) 33152);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        java.lang.String str16 = lwjgl3ApplicationConfiguration1.title;
        int int17 = lwjgl3ApplicationConfiguration1.getwindowX();
        int int18 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        int int19 = lwjgl3ApplicationConfiguration1.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 765 + "'", int19 == 765);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 765;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.samples = (-458762);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        int int18 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowHeight = 10;
        lwjgl3ApplicationConfiguration0.setTitle("00ff0000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-92), (float) (-1888288));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1246176) + "'", int2 == (-1246176));
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1077936368), 0, (int) (short) 0);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        int int20 = lwjgl3ApplicationConfiguration19.samples;
        lwjgl3ApplicationConfiguration19.setwindowY(9);
        lwjgl3ApplicationConfiguration19.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration19.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int29 = lwjgl3ApplicationConfiguration28.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType31);
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int36 = lwjgl3ApplicationConfiguration35.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = lwjgl3ApplicationConfiguration35.windowListener;
        int int39 = lwjgl3ApplicationConfiguration35.getsamples();
        com.badlogic.gdx.Files.FileType fileType40 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration35.preferencesFileType = fileType40;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType40;
        int int44 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int45 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration37);
        org.junit.Assert.assertNull(lwjgl3WindowListener38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + fileType40 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType40.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 480 + "'", int44 == 480);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        boolean boolean15 = lwjgl3ApplicationConfiguration11.vSyncEnabled;
        lwjgl3ApplicationConfiguration11.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode18;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration1.stencil = 43371;
        lwjgl3ApplicationConfiguration1.windowWidth = (-10223606);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration1.windowHeight = (-2147481728);
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.r = (-16777085);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setwindowY((-4628480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2560, (float) (-36880), (float) (-2147483648), 1.1068623E28f);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-2320), (float) (-2147099648), (float) 65471, 0.5137255f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6480626E38f) + "'", float4 == (-1.6480626E38f));
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.b = (short) 0;
        int int8 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setTitle("003060ff");
        lwjgl3ApplicationConfiguration0.a = (-1879048192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.depth = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.disableAudio = false;
        lwjgl3ApplicationConfiguration14.setdepth((-65281));
        lwjgl3ApplicationConfiguration14.audioDeviceSimultaneousSources = 163200;
        int int21 = lwjgl3ApplicationConfiguration14.a;
        lwjgl3ApplicationConfiguration14.audioDeviceSimultaneousSources = 16;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-4090624);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.6666667f, (-2.463949E-32f), (float) 2550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11267082 + "'", int3 == 11267082);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-65280));
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-45312), (float) 4080, (float) (-15), (float) 514080);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) '4');
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (-100466688));
        com.badlogic.gdx.graphics.Color color9 = color4.mul(color6);
        com.badlogic.gdx.graphics.Color color14 = color9.sub((float) 536867136, (float) 5961728, 2.2775203E-38f, (-1.4805586E-33f));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int15 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration1.setwindowY((-8160));
        lwjgl3ApplicationConfiguration1.windowMaxHeight = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.19354838f, (float) (-415027232), (float) 40664886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 50331648, (float) (-1075773696), (-1.7013899E38f), (float) (-21376768));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16777216) + "'", int4 == (-16777216));
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color25 = color19.sub((float) 2, 0.49803922f, (float) (-654724064), 0.49803922f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color19, (-1286733314));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        int int15 = com.badlogic.gdx.graphics.Color.rgb565(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color18 = color14.lerp(color16, 1.06321716E37f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65535 + "'", int15 == 65535);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color7 = color4.sub(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color9 = color6.premultiplyAlpha();
        int int10 = color9.toIntBits();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-16777216) + "'", int10 == (-16777216));
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.b;
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.setuseGL30(false);
        int int23 = lwjgl3ApplicationConfiguration16.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration0.setTitle("0000fb12");
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(1020460416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-40036));
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-62876);
        lwjgl3ApplicationConfiguration0.b = (-654724064);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.stencil = 100;
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.g = (-2284544);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        color0.a = 16;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-648224));
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener12;
        int int14 = lwjgl3ApplicationConfiguration1.stencil;
        lwjgl3ApplicationConfiguration1.windowHeight = (-16033380);
        int int17 = lwjgl3ApplicationConfiguration1.a;
        lwjgl3ApplicationConfiguration1.setsamples(13260);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = color19.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color19);
        int int23 = com.badlogic.gdx.graphics.Color.rgba4444(color19);
        float float24 = color19.b;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((-1.0f), (float) (-250615296), (float) 234, (float) (-36));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color((-40036));
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color36, 16);
        color36.a = 0L;
        com.badlogic.gdx.graphics.Color color41 = color34.mul(color36);
        com.badlogic.gdx.graphics.Color color46 = color34.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color46, 33791);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color46);
        com.badlogic.gdx.graphics.Color color50 = color32.sub(color49);
        com.badlogic.gdx.graphics.Color color51 = color32.cpy();
        com.badlogic.gdx.graphics.Color color53 = color31.lerp(color51, (float) 1L);
        com.badlogic.gdx.graphics.Color color58 = color53.mul((float) 63518, (-1.4805586E-33f), 0.0f, (float) 514080);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(color53);
        com.badlogic.gdx.graphics.Color color60 = color29.mul(color53);
        com.badlogic.gdx.graphics.Color color61 = color19.sub(color29);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1502683136), (float) 32767, (-1.6016938E38f), (float) (-65025));
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        com.badlogic.gdx.graphics.Color color6 = color4.cpy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2016 + "'", int5 == 2016);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1077936368));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.b = (-52320);
        int int10 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((float) (-256), (float) 6349110, (float) 40664886, (float) 'a');
        float float18 = color17.g;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        float float20 = color17.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color3 = color2.premultiplyAlpha();
        float float4 = color2.b;
        float float5 = color2.g;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration5.samples;
        int int7 = lwjgl3ApplicationConfiguration5.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1621098495, (-2144), (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.windowMinHeight = 1621098495;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color8 = color1.add(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color13 = color11.mul((float) (-62876));
        color13.a = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color20;
        int int22 = com.badlogic.gdx.graphics.Color.rgb888(color20);
        boolean boolean24 = color20.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color29;
        com.badlogic.gdx.graphics.Color color35 = color29.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color36 = color20.mul(color35);
        com.badlogic.gdx.graphics.Color color38 = color35.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color40 = color13.lerp(color38, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color42 = color8.lerp(color13, (float) 862994742);
        com.badlogic.gdx.graphics.Color color43 = color42.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color42, (-10224128));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(480);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.depth = 765;
        int int14 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-11241472), (-218557696));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.title = "ff000000";
        java.lang.String str14 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (byte) 1);
        float float4 = color3.b;
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        int int9 = lwjgl3ApplicationConfiguration1.windowWidth;
        lwjgl3ApplicationConfiguration1.windowMinWidth = 33021;
        boolean boolean12 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 16775680;
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.BROWN;
        int int16 = color15.toIntBits();
        float float17 = color15.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2305) + "'", int16 == (-2305));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 862994742;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-16777216), 2097152);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int11 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(653051);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color7 = color6.clamp();
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 16);
        color13.a = 0L;
        com.badlogic.gdx.graphics.Color color18 = color11.mul(color13);
        com.badlogic.gdx.graphics.Color color23 = color11.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color23, 33791);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color27 = color9.sub(color26);
        com.badlogic.gdx.graphics.Color color28 = color27.clamp();
        float float29 = color27.a;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color27, (-10223606));
        com.badlogic.gdx.graphics.Color color32 = color7.sub(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration33.initialBackgroundColor = color37;
        com.badlogic.gdx.graphics.Color color43 = color37.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color47 = color37.lerp(color45, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color47, (-545421065));
        int int50 = color47.toIntBits();
        com.badlogic.gdx.graphics.Color color51 = color27.sub(color47);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        lwjgl3ApplicationConfiguration55.setvSyncEnabled(false);
        boolean boolean58 = lwjgl3ApplicationConfiguration55.getuseGL30();
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color62, 16);
        color62.a = 0L;
        com.badlogic.gdx.graphics.Color color67 = color60.mul(color62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.stencil = 10;
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration68.initialBackgroundColor = color72;
        int int74 = com.badlogic.gdx.graphics.Color.rgb888(color72);
        boolean boolean76 = color72.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration77.stencil = 10;
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration77.initialBackgroundColor = color81;
        com.badlogic.gdx.graphics.Color color87 = color81.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color88 = color72.mul(color87);
        com.badlogic.gdx.graphics.Color color89 = new com.badlogic.gdx.graphics.Color(color87);
        com.badlogic.gdx.graphics.Color color90 = color62.set(color89);
        lwjgl3ApplicationConfiguration55.setInitialBackgroundColor(color90);
        com.badlogic.gdx.graphics.Color color92 = color53.add(color90);
        com.badlogic.gdx.graphics.Color color93 = color27.mul(color90);
        com.badlogic.gdx.graphics.Color color98 = new com.badlogic.gdx.graphics.Color((-1.6995508E38f), (float) (-2147483648), (float) (-16033380), (float) (-1077936368));
        com.badlogic.gdx.graphics.Color color99 = color93.add(color98);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-142049825) + "'", int50 == (-142049825));
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertNotNull(color92);
        org.junit.Assert.assertNotNull(color93);
        org.junit.Assert.assertNotNull(color99);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.windowHeight = (-255);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        lwjgl3ApplicationConfiguration15.setvSyncEnabled(false);
        boolean boolean18 = lwjgl3ApplicationConfiguration15.getuseGL30();
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color22, 16);
        color22.a = 0L;
        com.badlogic.gdx.graphics.Color color27 = color20.mul(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration28.initialBackgroundColor = color32;
        int int34 = com.badlogic.gdx.graphics.Color.rgb888(color32);
        boolean boolean36 = color32.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.stencil = 10;
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration37.initialBackgroundColor = color41;
        com.badlogic.gdx.graphics.Color color47 = color41.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color48 = color32.mul(color47);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color47);
        com.badlogic.gdx.graphics.Color color50 = color22.set(color49);
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color50);
        com.badlogic.gdx.graphics.Color color52 = color13.add(color50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.stencil = 10;
        int int56 = lwjgl3ApplicationConfiguration53.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color57 = lwjgl3ApplicationConfiguration53.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color59 = color52.lerp(color57, 0.0f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color59);
        lwjgl3ApplicationConfiguration0.windowHeight = (-3825);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-255) + "'", int10 == (-255));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        java.lang.String str40 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.setsamples((-2089026813));
        int int43 = lwjgl3ApplicationConfiguration1.a;
        int int44 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ".prefs/" + "'", str40, ".prefs/");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color8 = color1.add(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 16);
        color13.a = 0L;
        com.badlogic.gdx.graphics.Color color18 = color11.mul(color13);
        com.badlogic.gdx.graphics.Color color23 = color11.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color23, 33791);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color28 = color26.mul(color27);
        com.badlogic.gdx.graphics.Color color34 = color26.lerp((float) (-537010321), 0.0f, (float) (-1728), (float) 507505200, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color35 = color8.mul(color34);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-321707263));
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) (-16761866), (float) (-64), (float) 130029600, (float) (-848128));
        java.lang.Class<?> wildcardClass7 = color1.getClass();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-545421065));
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3ApplicationConfiguration1.setWindowPosition(0, 9);
        int int19 = lwjgl3ApplicationConfiguration1.depth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 483965280, (float) (-983040), (float) 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1248) + "'", int3 == (-1248));
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.title = ".prefs/";
        lwjgl3ApplicationConfiguration1.setwindowY(0);
        int int8 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        int int9 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 1769996257, (float) (-26), 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1216) + "'", int3 == (-1216));
    }
}
