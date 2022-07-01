import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.windowHeight;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-16777216);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-142049825), (float) (-13126704), (float) '#', (float) 16711680);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color12 = color6.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color6, 1.7014117E38f);
        int int15 = color4.toIntBits();
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16711680 + "'", int15 == 16711680);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(11059605, 62445, 0, (-503341578));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-151261803) + "'", int4 == (-151261803));
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 61440, (float) (-134217944), (float) (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65280) + "'", int4 == (-65280));
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-1L), (float) (-2140996640), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-63457) + "'", int3 == (-63457));
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int9 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int24 = lwjgl3ApplicationConfiguration23.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration23);
        boolean boolean26 = color22.equals((java.lang.Object) lwjgl3ApplicationConfiguration23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration23.getpreferencesFileType();
        java.lang.String str30 = lwjgl3ApplicationConfiguration23.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ".prefs/" + "'", str30, ".prefs/");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-1502683136), 1769996257, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7936) + "'", int4 == (-7936));
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
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
        com.badlogic.gdx.graphics.Color color39 = color38.cpy();
        int int40 = com.badlogic.gdx.graphics.Color.rgb888(color39);
        int int41 = com.badlogic.gdx.graphics.Color.rgb565(color39);
        com.badlogic.gdx.graphics.Color color47 = color39.lerp((float) (-7555886), (float) 100, (float) 25500, (float) (-62876), (float) 514080);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color49, 16);
        float float52 = color49.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color49, 512);
        int int55 = com.badlogic.gdx.graphics.Color.rgb565(color49);
        com.badlogic.gdx.graphics.Color color57 = color47.lerp(color49, (float) 167772160);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color47, 1769996257);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 33791 + "'", int40 == 33791);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1055 + "'", int41 == 1055);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
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
        com.badlogic.gdx.graphics.Color color23 = color21.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color21, 1671172080);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color21, 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        int int9 = lwjgl3ApplicationConfiguration1.b;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.98039216f + "'", float7 == 0.98039216f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1.7012856E38f), (float) (-1077952513), (float) (-65536), (-1.9187849E28f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-0.0f) + "'", float4 == (-0.0f));
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(14417949, (-15), 2147483647, (-16764024));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7010254E38f) + "'", float4 == (-1.7010254E38f));
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-12));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3060) + "'", int1 == (-3060));
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 640, 1465382614);
        lwjgl3ApplicationConfiguration1.windowY = 640;
        lwjgl3ApplicationConfiguration1.setTitle("ff000000");
        lwjgl3ApplicationConfiguration1.windowY = (-668991488);
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        int int19 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-668991488), (float) 224, (float) (-16033380));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-497025568) + "'", int3 == (-497025568));
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-1778519256), 16613376, (-15), 607);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-134360) + "'", int4 == (-134360));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-62876), (float) 6349110, (float) (-1), (float) 0);
        color4.a = 0.0f;
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        float float8 = color4.g;
        int int9 = color4.toIntBits();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2016 + "'", int7 == 2016);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65280 + "'", int9 == 65280);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.a = (-6553036);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-8160);
        lwjgl3ApplicationConfiguration0.setwindowX((-2147483648));
        int int19 = lwjgl3ApplicationConfiguration0.windowX;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2147483648) + "'", int19 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 2032, (float) 2550, (float) 16711680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 536867136 + "'", int3 == 536867136);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-1504), (-2.647102E-20f), (float) 2147418367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-52320), 2550, (-134217944), 1671172080);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7011944E38f) + "'", float4 == (-1.7011944E38f));
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 607, (float) (-29852), (float) 52625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-537010321) + "'", int3 == (-537010321));
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color16;
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color16);
        boolean boolean20 = color16.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color31 = color25.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color32 = color16.mul(color31);
        com.badlogic.gdx.graphics.Color color33 = color31.premultiplyAlpha();
        color31.g = 537535241;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color31;
        lwjgl3ApplicationConfiguration0.setWindowedMode(6349110, 509920);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int42 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6349110 + "'", int42 == 6349110);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) (-503341578), (-1.5399916E-33f), (float) 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        boolean boolean13 = color9.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color24 = color18.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color25 = color9.mul(color24);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        lwjgl3ApplicationConfiguration29.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color37;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration39.initialBackgroundColor = color43;
        com.badlogic.gdx.graphics.Color color49 = color43.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color53 = color43.lerp(color51, (float) 100L);
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
        com.badlogic.gdx.graphics.Color color92 = color53.sub(color90);
        com.badlogic.gdx.graphics.Color color94 = color37.lerp(color53, 100.0f);
        com.badlogic.gdx.graphics.Color color95 = new com.badlogic.gdx.graphics.Color(color94);
        com.badlogic.gdx.graphics.Color color97 = color27.lerp(color95, (float) (-255));
        com.badlogic.gdx.graphics.Color color98 = color4.set(color97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertNotNull(color92);
        org.junit.Assert.assertNotNull(color94);
        org.junit.Assert.assertNotNull(color97);
        org.junit.Assert.assertNotNull(color98);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(514080, (-100466688), 4080, (-65280));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.5399916E-33f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, 130029600);
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-10188800), (-983040), (-66797), (-15));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8943616) + "'", int4 == (-8943616));
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        int int15 = com.badlogic.gdx.graphics.Color.rgb565(color14);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, 234);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65535 + "'", int15 == 65535);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.g = 130029600;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration1.windowListener;
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(1621098495);
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (short) 10;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1L, (float) (-8257792), 0.53333336f, (float) 16);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.5399916E-33f), (float) 0L, (float) (-2147483648), (float) 43371);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 650565 + "'", int4 == 650565);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.useVsync(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setWindowedMode(40664886, 3309388);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2147418367;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setTitle("00000020");
        int int15 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-10223606), 16777215);
        int int14 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(2016, (-2865), (-1778519256));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(16711935, (-16764024), 6528502, (-541344));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-33584897) + "'", int4 == (-33584897));
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.samples = 63488;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-52992));
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int8 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (short) 10;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-2089026813));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int5 = lwjgl3ApplicationConfiguration4.audioDeviceBufferSize;
        int int6 = lwjgl3ApplicationConfiguration4.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration4.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00000000", fileType7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode9);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(607);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
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
        lwjgl3ApplicationConfiguration12.setsamples(537535241);
        int int17 = lwjgl3ApplicationConfiguration12.getgles30ContextMinorVersion();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color();
        int int2 = color1.toIntBits();
        int int3 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color1, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color7 = color1.sub(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color14 = color8.lerp((float) (byte) 10, (float) 1465382614, (float) 40664886, (float) (-1L), (float) (-2147413088));
        int int15 = com.badlogic.gdx.graphics.Color.rgb565(color14);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 16);
        color19.a = 0L;
        com.badlogic.gdx.graphics.Color color24 = color17.mul(color19);
        com.badlogic.gdx.graphics.Color color29 = color17.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color17, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color33 = color14.lerp(color17, (float) (-129024));
        com.badlogic.gdx.graphics.Color color34 = color7.mul(color14);
        int int35 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-16777216) + "'", int35 == (-16777216));
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        java.lang.Class<?> wildcardClass14 = color13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-2089026813), 0.0f, (float) (-1504), 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-360960) + "'", int4 == (-360960));
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean10 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        boolean boolean11 = lwjgl3ApplicationConfiguration1.windowDecorated;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.cpy();
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color30 = color25.set((float) 786400, (float) (-65280), (float) (-65280), (float) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = color25.sub((float) (-2147483648), (float) (-864551100), (float) 130029600, (float) (-16777216));
        int int36 = com.badlogic.gdx.graphics.Color.rgba8888(color25);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-65281) + "'", int36 == (-65281));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        color6.a = 0.84313726f;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.title;
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration1.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) (-548854), (float) 2016, (float) (-2147413088));
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-65280));
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 63488, (float) 514080, (float) (-276908320), (float) (-52344));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-764808) + "'", int4 == (-764808));
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 7680, 9.18355E-41f, (float) 1L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-503316225) + "'", int3 == (-503316225));
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 372608, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1445928036) + "'", int2 == (-1445928036));
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color4 = color0.clamp();
        color0.a = 650565;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-150), (float) (-1107701632), (float) 100L, (-3.587E-42f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6975328E38f) + "'", float4 == (-1.6975328E38f));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 0, 0.0f, 0.98039216f, (float) 51855);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 6.1897002E29f + "'", float4 == 6.1897002E29f);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-150), (-548854), (-8943616), (-66797));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013966E38f) + "'", float4 == (-1.7013966E38f));
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        int int14 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.windowX = 130029600;
        lwjgl3ApplicationConfiguration1.setwindowMinWidth((-59244732));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-10223606), (float) 32256, (float) (-7936), (float) (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-255) + "'", int4 == (-255));
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int13 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-654724064), (float) (-503341578));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-59244732), (float) 16711680, 0.0f, (float) (-29852));
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.windowY = (short) 100;
        lwjgl3ApplicationConfiguration0.windowY = 100;
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-45312));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11554560) + "'", int1 == (-11554560));
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration8.initialBackgroundColor = color12;
        int int14 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        boolean boolean16 = color12.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        com.badlogic.gdx.graphics.Color color27 = color21.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color28 = color12.mul(color27);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int32 = lwjgl3ApplicationConfiguration31.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        boolean boolean34 = color30.equals((java.lang.Object) lwjgl3ApplicationConfiguration31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration31.setFullscreenMode(displayMode35);
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration31.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ffff00", fileType37);
        int int39 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration1.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = 1621098495;
        lwjgl3ApplicationConfiguration10.setwindowMinWidth(62445);
        lwjgl3ApplicationConfiguration10.windowDecorated = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int26 = lwjgl3ApplicationConfiguration25.getwindowY();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(63488, 267782144, 6349110, (-2147481728));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-66797);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) (byte) 1, 40664886);
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
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration1.depth = 1465382614;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(25500);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-2865));
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color15 = color8.lerp(color13, (float) 786400);
        int int16 = color15.toIntBits();
        float float17 = color15.b;
        com.badlogic.gdx.graphics.Color color18 = color0.set(color15);
        color0.a = (short) -1;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-65536) + "'", int16 == (-65536));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 2147483647, (float) (-10), 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1728) + "'", int3 == (-1728));
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(6.1897002E29f, (float) (-36), (float) 3309388, (float) (-1728));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-64) + "'", int4 == (-64));
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setwindowX((int) (short) -1);
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        boolean boolean8 = lwjgl3ApplicationConfiguration1.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-321707263), 0.0f, (float) 626699475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-545421065));
        color14.a = 1L;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color22, 16);
        color22.a = 0L;
        com.badlogic.gdx.graphics.Color color27 = color20.mul(color22);
        com.badlogic.gdx.graphics.Color color32 = color20.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color32, 33791);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        color32.b = (-2147418368);
        boolean boolean38 = color14.equals((java.lang.Object) color32);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color32);
        color32.b = 650565;
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 514080, (float) (-129024), (float) 14417949);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 64274, (-5.53230546E17f), 0.84313726f, (float) (-52992));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-786496) + "'", int4 == (-786496));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1077936368));
        int int10 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-5543167), 0, 14417949, (-2105736960), (-164075620), 0, (-2089026813));
        int int24 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowX();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        lwjgl3ApplicationConfiguration7.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration13.r = ' ';
        lwjgl3ApplicationConfiguration13.windowResizable = false;
        int int18 = lwjgl3ApplicationConfiguration13.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        int int22 = lwjgl3ApplicationConfiguration19.depth;
        int int23 = lwjgl3ApplicationConfiguration19.stencil;
        int int24 = lwjgl3ApplicationConfiguration19.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode27;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration7.hdpiMode = hdpiMode27;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-59244732));
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setAudioConfig(61455, 131072, (int) '4');
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
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
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 640;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-45312));
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
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
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-116));
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.PURPLE;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, 16);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1671024128));
        com.badlogic.gdx.graphics.Color color6 = color0.lerp(color4, 1.96271E-40f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-36));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(480, (-4090624), (-548854), 33021);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-6.604906E36f) + "'", float4 == (-6.604906E36f));
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-138042720), (float) (-8257792), (float) 40664886, (float) 11059605);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 63518);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16197090 + "'", int1 == 16197090);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color15 = color8.lerp(color13, (float) 786400);
        int int16 = color15.toIntBits();
        float float17 = color15.b;
        com.badlogic.gdx.graphics.Color color18 = color0.set(color15);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color18, 97);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-65536) + "'", int16 == (-65536));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6528502, (float) '#', (float) (-1), 0.53333336f);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.7490196f, (float) 650565, (float) 16777215);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-16646145), 10, (-65280), (-1107701632));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4.3199905E37f) + "'", float4 == (-4.3199905E37f));
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 512, (float) 1, (float) (-2147099648), (-8.772646E37f));
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.title = "";
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration10.setvSyncEnabled(false);
        boolean boolean13 = lwjgl3ApplicationConfiguration10.getuseGL30();
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color17, 16);
        color17.a = 0L;
        com.badlogic.gdx.graphics.Color color22 = color15.mul(color17);
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
        com.badlogic.gdx.graphics.Color color45 = color17.set(color44);
        lwjgl3ApplicationConfiguration10.setInitialBackgroundColor(color45);
        lwjgl3ApplicationConfiguration10.setwindowMinWidth(2);
        lwjgl3ApplicationConfiguration10.windowWidth = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.depth;
        int int55 = lwjgl3ApplicationConfiguration51.stencil;
        int int56 = lwjgl3ApplicationConfiguration51.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = null;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode57);
        int int59 = lwjgl3ApplicationConfiguration51.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.stencil = 10;
        int int63 = lwjgl3ApplicationConfiguration60.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration60.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType65 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration60.setpreferencesFileType(fileType65);
        int int67 = lwjgl3ApplicationConfiguration60.depth;
        lwjgl3ApplicationConfiguration60.windowX = 765;
        int int70 = lwjgl3ApplicationConfiguration60.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = lwjgl3ApplicationConfiguration60.hdpiMode;
        lwjgl3ApplicationConfiguration51.hdpiMode = hdpiMode71;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode71;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode71);
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 16 + "'", int54 == 16);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + fileType65 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType65.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 16 + "'", int67 == 16);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
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
        color28.a = 509920;
        int int31 = com.badlogic.gdx.graphics.Color.rgba8888(color28);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 132184352 + "'", int31 == 132184352);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-2.647102E-20f), (float) (-545421065), (float) (-36880), (float) (-7936));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2023680) + "'", int4 == (-2023680));
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.7010254E38f), (float) (-654724064), (-1.7013859E38f), (float) (-17796196));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-266942944) + "'", int4 == (-266942944));
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1671024128));
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.SLATE;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) 9, (float) (byte) 10, (float) 0, 0.0f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        int int11 = lwjgl3ApplicationConfiguration8.depth;
        int int12 = lwjgl3ApplicationConfiguration8.stencil;
        lwjgl3ApplicationConfiguration8.depth = 100;
        int int15 = lwjgl3ApplicationConfiguration8.windowMaxWidth;
        boolean boolean16 = color2.equals((java.lang.Object) lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color2);
        boolean boolean18 = color1.equals((java.lang.Object) color17);
        java.lang.Class<?> wildcardClass19 = color17.getClass();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-16776961), (float) (-138042720), 0.0f, (float) 65535);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16711425 + "'", int4 == 16711425);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
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
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration1.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 640, 1465382614);
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.useGL30;
        int int7 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
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
        int int14 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
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
        float float34 = color9.r;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color9, (-10));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 50331648, 0.0f, (float) 2113863936, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        lwjgl3ApplicationConfiguration1.windowHeight = 3;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.windowWidth = 16766720;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1953529918;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.windowY = 8;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147413088));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 234, 6528502);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int16 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-637684704);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 650565, (float) (-276908320));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-480788480) + "'", int2 == (-480788480));
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ff0000ff");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.a = 509920;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration11.a = 25500;
        int int14 = lwjgl3ApplicationConfiguration11.getdepth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.98039216f + "'", float7 == 0.98039216f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        int int15 = lwjgl3ApplicationConfiguration12.b;
        boolean boolean16 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 10, 10);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.useGL30;
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType27);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType29;
        int int32 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        boolean boolean33 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 640 + "'", int32 == 640);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-90112));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22978560) + "'", int1 == (-22978560));
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 16766720, (float) (-864551100), (float) (-321707263), (float) (-2147413088));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-644874240) + "'", int4 == (-644874240));
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 4063, (float) (-16776704), (float) 65535);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-805306623) + "'", int3 == (-805306623));
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.windowWidth = (-2147413088);
        lwjgl3ApplicationConfiguration7.windowResizable = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-64), 0, 131072, 401539072);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014053E38f) + "'", float4 == (-1.7014053E38f));
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.b = (-1077952513);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.gles30ContextMajorVersion = (-33488896);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(65280, 16711680, (-16), (-1107701632));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6016938E38f) + "'", float4 == (-1.6016938E38f));
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType3);
        lwjgl3ApplicationConfiguration0.b = (-654724064);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00000020");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(9.18355E-41f, 0.5137255f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 131 + "'", int2 == 131);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-15), (float) 16766720, 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-256) + "'", int3 == (-256));
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(28901, 131072, 16197090, (-1107701632));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1478332187) + "'", int4 == (-1478332187));
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = 1621098495;
        int int13 = lwjgl3ApplicationConfiguration10.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((int) '4', (-208), 163200, (-65280));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6960171E38f) + "'", float4 == (-1.6960171E38f));
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowX(586415136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-2144), (-497025568), 0, (-480788480));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2144) + "'", int4 == (-2144));
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 34816, 0.0f, (float) 16777216, (float) (-32));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-480) + "'", int4 == (-480));
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-14483712), (float) 653055, (float) (-2147413088), (float) (-64));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-6.5765565E26f) + "'", float4 == (-6.5765565E26f));
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.preferencesDirectory = ".prefs/";
        int int14 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        int int15 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        lwjgl3ApplicationConfiguration1.depth = (-569376768);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (-8.952473E30f), (float) 3309388, (float) 130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        boolean boolean13 = color9.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color24 = color18.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color25 = color9.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = color24.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color24, 3);
        com.badlogic.gdx.graphics.Color color31 = color24.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color31, (-40036));
        com.badlogic.gdx.graphics.Color color34 = color31.cpy();
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color((float) 8925, (float) 25500, (-3.587E-42f), 0.0f);
        com.badlogic.gdx.graphics.Color color40 = color34.add(color39);
        com.badlogic.gdx.graphics.Color color41 = color4.sub(color34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.stencil = 10;
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration42.initialBackgroundColor = color46;
        float float48 = color46.toFloatBits();
        com.badlogic.gdx.graphics.Color color49 = color34.add(color46);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color46, (-15514229));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-59244732), (-545421065), (-1613299457), (-4089));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013928E38f) + "'", float4 == (-1.7013928E38f));
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
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
        boolean boolean26 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SLATE;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) 9, (float) (byte) 10, (float) 0, 0.0f);
        int int6 = color0.toIntBits();
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 65535 + "'", int6 == 65535);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16776960 + "'", int7 == 16776960);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
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
        int int26 = com.badlogic.gdx.graphics.Color.rgb888(color19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32767 + "'", int26 == 32767);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-6.5765565E26f), (float) (-458762), (float) (-65280), (-1.9187849E28f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1536) + "'", int4 == (-1536));
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
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
        lwjgl3ApplicationConfiguration11.setTitle("hi!");
        java.lang.String str16 = lwjgl3ApplicationConfiguration11.title;
        int int17 = lwjgl3ApplicationConfiguration11.windowY;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.stencil = 16711935;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 0, 480);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-52344);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 9;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
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
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 63518;
        lwjgl3ApplicationConfiguration0.b = (-17796196);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((-1.4805586E-33f), (float) 8925, (float) 512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18005600 + "'", int3 == 18005600);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-59475968), (float) 16766720, (float) 130029600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16776704), (float) (-1L), (float) 553648000, (float) (byte) 10);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1.9187849E28f), (float) (-100466688), (float) (-16764024), (-5.53230546E17f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-0.0f) + "'", float4 == (-0.0f));
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color15 = color13.mul((float) (-62876));
        color15.a = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        int int24 = com.badlogic.gdx.graphics.Color.rgb888(color22);
        boolean boolean26 = color22.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color31;
        com.badlogic.gdx.graphics.Color color37 = color31.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color38 = color22.mul(color37);
        com.badlogic.gdx.graphics.Color color40 = color37.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color42 = color15.lerp(color40, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color43 = color15.cpy();
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color43;
        int int45 = color43.toIntBits();
        float float46 = color43.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-16777216) + "'", int45 == (-16777216));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        float float3 = color2.toFloatBits();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 9.1655E-41f + "'", float3 == 9.1655E-41f);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 16738740, (float) (-33488896), (float) 11059605, (float) 512);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.windowHeight = 9;
        boolean boolean6 = lwjgl3ApplicationConfiguration1.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("00830000");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.0f, (float) 2147483647, (float) 1L, (float) (-151165028));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-256) + "'", int4 == (-256));
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, (int) 'a');
        color19.r = 0.0f;
        com.badlogic.gdx.graphics.Color color29 = color19.add((float) (-15514229), (float) 14417949, (float) 514080, (float) 862994742);
        int int30 = com.badlogic.gdx.graphics.Color.rgb565(color19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2047 + "'", int30 == 2047);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration0.windowListener;
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
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
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setwindowX((int) (short) -1);
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.setwindowWidth((-14483712));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 10, (float) (-3060), (float) (-503316225), (float) (-15));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-225) + "'", int4 == (-225));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int8 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-255));
        com.badlogic.gdx.graphics.Color color7 = color1.lerp(0.0f, (float) 252, (float) (-15), (float) (-622910848), (float) (-16580607));
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-208), (float) (-8257792), (float) 586415136, (float) 7680);
        com.badlogic.gdx.graphics.Color color5 = color4.clamp();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, 63151);
        com.badlogic.gdx.graphics.Color color9 = color4.set((-64));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 63488;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 3;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color15 = color4.mul((float) '#', (float) (-10223606), (float) (-545421065), (float) 3309388);
        int int16 = com.badlogic.gdx.graphics.Color.rgb565(color15);
        com.badlogic.gdx.graphics.Color color17 = color15.clamp();
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((-1671024128));
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-16711681), (float) 43371, (float) (-7555886), (float) (-1948738560));
        com.badlogic.gdx.graphics.Color color25 = color15.mul(color24);
        int int26 = color15.toIntBits();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 63488 + "'", int16 == 63488);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.windowWidth = 100;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (-66797), 163200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) '#', 0.0f, (float) (-15728400), (float) (-1948738560));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-587202560) + "'", int4 == (-587202560));
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-553651968), (float) (-3060), 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6168960) + "'", int3 == (-6168960));
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-5.875603E37f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 65536;
        lwjgl3ApplicationConfiguration0.setWindowedMode(131090400, 512);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
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
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color19, 3);
        com.badlogic.gdx.graphics.Color color26 = color19.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color26, (-40036));
        com.badlogic.gdx.graphics.Color color29 = color26.cpy();
        com.badlogic.gdx.graphics.Color color31 = color29.set((int) 'a');
        float float32 = color29.g;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-587202560), (float) (-16842496), (float) 3309388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 507505200 + "'", int3 == 507505200);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration0.windowListener;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowWidth = (-503341578);
        int int19 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1897903, 62445);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
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
        lwjgl3ApplicationConfiguration0.b = 7048739;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.a = (-6553036);
        lwjgl3ApplicationConfiguration0.setAudioConfig(640, 16, (-29852));
        int int19 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, 16);
        color10.a = 0L;
        com.badlogic.gdx.graphics.Color color15 = color8.mul(color10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color21);
        boolean boolean25 = color21.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color36 = color30.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color37 = color21.mul(color36);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color36);
        float float39 = color38.r;
        com.badlogic.gdx.graphics.Color color40 = color16.mul(color38);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color38;
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color45, 16);
        color45.a = 0L;
        com.badlogic.gdx.graphics.Color color50 = color43.mul(color45);
        com.badlogic.gdx.graphics.Color color55 = color43.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color57 = color43.set((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color43;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener59 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.Files.FileType fileType60 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color61 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setAudioConfig(255, (int) (short) 10, (-225));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNull(lwjgl3WindowListener59);
        org.junit.Assert.assertTrue("'" + fileType60 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType60.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-1077952513));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-256), (-33584897), 507505200, (-9728477));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013859E38f) + "'", float4 == (-1.7013859E38f));
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-848128), (-5.0593836E30f), (float) (-569376768), (float) 537535241);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-45312));
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int8 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
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
        lwjgl3ApplicationConfiguration1.preferencesDirectory = "00ffff00";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration1.setAudioConfig(16711680, 255, (-164075620));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration17.windowMaxHeight = (-266942944);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
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
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color((float) (-256), (float) 6349110, (float) 40664886, (float) 'a');
        com.badlogic.gdx.graphics.Color color68 = color59.add(color67);
        color68.g = 10;
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
        org.junit.Assert.assertNotNull(color68);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("827d0000");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(512);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-7555886), 0.0f, 0.9647059f, (float) 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.915235E-31f) + "'", float4 == (-3.915235E-31f));
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 1953529918);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int11 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = ".prefs/";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-22978560), (float) 2, (float) 634911, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1476467812) + "'", int4 == (-1476467812));
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
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
        color21.r = 163200;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color21);
        int int27 = com.badlogic.gdx.graphics.Color.rgba8888(color26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2147483648) + "'", int27 == (-2147483648));
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color16;
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color16);
        boolean boolean20 = color16.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color31 = color25.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color32 = color16.mul(color31);
        com.badlogic.gdx.graphics.Color color33 = color31.premultiplyAlpha();
        color31.g = 537535241;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color31;
        lwjgl3ApplicationConfiguration0.setWindowedMode(6349110, 509920);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int42 = lwjgl3ApplicationConfiguration41.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-7555886), (-1.9187849E28f), (float) (-1502683136), 0.06666667f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-5.562402E-22f) + "'", float4 == (-5.562402E-22f));
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
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
        com.badlogic.gdx.graphics.Color color44 = color8.mul((float) 1897903);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((-654724064));
        boolean boolean47 = color44.equals((java.lang.Object) (-654724064));
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
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.title = "hi!";
        int int11 = lwjgl3ApplicationConfiguration7.getwindowMinWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 33791;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color1);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33791 + "'", int5 == 33791);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-16777085) + "'", int7 == (-16777085));
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(65280, (-541344), (-64), 1769996257);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6880936E38f) + "'", float4 == (-1.6880936E38f));
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-864551100), 267782144, 9, (-7555886));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-8.506964E37f) + "'", float4 == (-8.506964E37f));
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(586415136, 16197090, (-16654816), (-983040));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.648194E38f) + "'", float4 == (-1.648194E38f));
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 0, (float) (-22978560), (float) 63488, (float) 14417949);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4.2535296E37f) + "'", float4 == (-4.2535296E37f));
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 862994742;
        lwjgl3ApplicationConfiguration1.windowY = 65520;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setsamples(4080);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-134217944);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1077936368), 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration1.useVsync(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
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
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color52 = color28.add(color33);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color54, 32256);
        com.badlogic.gdx.graphics.Color color57 = color53.mul(color54);
        com.badlogic.gdx.graphics.Color color63 = color53.lerp((float) (-2147481728), (-1.6988936E38f), (float) (-36880), (float) (-447780), (float) (-16777085));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color63);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 33021);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8420355 + "'", int1 == 8420355);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-65025), (float) 512, (float) '4', (float) 3);
        com.badlogic.gdx.graphics.Color color6 = color4.mul((float) 863980544);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-266942944), 16766720, 234, (-65025));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-14816) + "'", int4 == (-14816));
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-1671024128));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-2147413088), (float) 16777215, (float) 33021, (-1.648194E38f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013859E38f) + "'", float4 == (-1.7013859E38f));
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-10188800), (-1049600), (-668991488), 6528502);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-227328) + "'", int4 == (-227328));
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
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
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        int int25 = lwjgl3ApplicationConfiguration22.b;
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setuseGL30(false);
        int int29 = lwjgl3ApplicationConfiguration22.getwindowY();
        int int30 = lwjgl3ApplicationConfiguration22.audioDeviceBufferCount;
        int int31 = lwjgl3ApplicationConfiguration22.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.b;
        boolean boolean36 = lwjgl3ApplicationConfiguration32.vSyncEnabled;
        lwjgl3ApplicationConfiguration32.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration32.hdpiMode = hdpiMode39;
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType41);
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00ffffff", fileType41);
        lwjgl3ApplicationConfiguration1.setWindowedMode((-458762), 16738740);
        lwjgl3ApplicationConfiguration1.setdepth((int) (byte) 1);
        int int49 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 1465382614, (float) (-16), (-3.587E-42f), 0.06666667f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15728623) + "'", int4 == (-15728623));
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
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
        boolean boolean44 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener45);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0000faff");
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 18005600, (float) 32, (float) (-2144), (float) (-129024));
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, 16);
        color10.a = 0L;
        com.badlogic.gdx.graphics.Color color15 = color8.mul(color10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color21);
        boolean boolean25 = color21.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color36 = color30.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color37 = color21.mul(color36);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color36);
        float float39 = color38.r;
        com.badlogic.gdx.graphics.Color color40 = color16.mul(color38);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color38;
        color38.b = 63518;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        lwjgl3ApplicationConfiguration15.r = ' ';
        lwjgl3ApplicationConfiguration15.windowResizable = false;
        int int20 = lwjgl3ApplicationConfiguration15.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        int int24 = lwjgl3ApplicationConfiguration21.depth;
        int int25 = lwjgl3ApplicationConfiguration21.stencil;
        int int26 = lwjgl3ApplicationConfiguration21.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = null;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration21.hdpiMode = hdpiMode29;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.graphics.Color color33 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((-1.7014117E38f), (-2.647102E-20f), (float) (-2140955648), (float) 11059605);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-266942944);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 1677721600, (-1.0407874E38f), (float) (-266942944), 3.57E-43f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16777216) + "'", int4 == (-16777216));
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.windowHeight = (byte) 1;
        lwjgl3ApplicationConfiguration1.windowMaxWidth = 65280;
        java.lang.String str12 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-33488896));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-2147483648), 863980544, (-503316225), 1174394321);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6947657E38f) + "'", float4 == (-1.6947657E38f));
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-63457));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16181535) + "'", int1 == (-16181535));
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.title = ".prefs/";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode6;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-548854);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        float float1 = color0.toFloatBits();
        float float2 = color0.g;
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.3199905E37f) + "'", float1 == (-4.3199905E37f));
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        float float11 = color4.b;
        float float12 = color4.g;
        color4.b = (-1.7014117E38f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-1445928036));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        java.lang.String str5 = lwjgl3ApplicationConfiguration1.title;
        int int6 = lwjgl3ApplicationConfiguration1.a;
        int int7 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration1.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-227328));
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.84313726f, (float) 64274);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16439278 + "'", int2 == 16439278);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
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
        com.badlogic.gdx.graphics.Color color23 = color21.cpy();
        com.badlogic.gdx.graphics.Color color28 = color23.set((float) (-2105736960), (float) 11059605, (float) (-134217944), (float) 16777216);
        color28.g = 1465382614;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.stencil = 786400;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        int int11 = lwjgl3ApplicationConfiguration8.r;
        lwjgl3ApplicationConfiguration8.useOpenGL3(true, 2046, (-2144));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
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
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, (-129024));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 2147418367, 0.0f, (-4.253984E37f), (-8.772646E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16777216) + "'", int4 == (-16777216));
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (short) 10);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (short) 0;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0083ff00");
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "003060ff";
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.7010254E38f), (-1.6947657E38f), (float) 2147418367, (float) (-1504));
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
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
        int int15 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-271), (float) (-503341578), (float) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-233897984) + "'", int3 == (-233897984));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.9206349f, 0.0f, 0.0f, (float) (-569376768));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-369098752) + "'", int4 == (-369098752));
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color1.g = (short) -1;
        com.badlogic.gdx.graphics.Color color17 = color1.set(1);
        int int18 = color17.toIntBits();
        com.badlogic.gdx.graphics.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color20 = color17.sub(color19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16777216 + "'", int18 == 16777216);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
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
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color27 = color22.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        float float28 = color27.a;
        com.badlogic.gdx.graphics.Color color30 = color19.lerp(color27, (float) 863980544);
        com.badlogic.gdx.graphics.Color color35 = color30.set((float) '#', 0.06666667f, (float) 3309388, (float) (-208));
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color40, 16);
        color40.a = 0L;
        com.badlogic.gdx.graphics.Color color45 = color38.mul(color40);
        com.badlogic.gdx.graphics.Color color50 = color38.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color50, 33791);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color54 = color36.sub(color53);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color59, 16);
        color59.a = 0L;
        com.badlogic.gdx.graphics.Color color64 = color57.mul(color59);
        com.badlogic.gdx.graphics.Color color69 = color57.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color69, 33791);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(color69);
        com.badlogic.gdx.graphics.Color color73 = color55.sub(color72);
        com.badlogic.gdx.graphics.Color color74 = color53.set(color72);
        com.badlogic.gdx.graphics.Color color75 = color35.mul(color72);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(color35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
// flaky:         org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color75);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
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
        float float23 = color19.r;
        color19.b = (-16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 480, (float) 537535241, (float) 10, 1.96271E-40f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, 224);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) 10, (float) (-2147483648), (float) 267782144, (-5.0593836E30f));
        com.badlogic.gdx.graphics.Color color13 = color4.lerp(color11, (float) (-2144));
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color4);
        int int15 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16777216) + "'", int15 == (-16777216));
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        lwjgl3ApplicationConfiguration20.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color28;
        lwjgl3ApplicationConfiguration20.g = 16711680;
        int int32 = lwjgl3ApplicationConfiguration20.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration20.audioDeviceBufferSize = 0;
        int int35 = lwjgl3ApplicationConfiguration20.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = lwjgl3ApplicationConfiguration20.hdpiMode;
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode36;
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-134217944);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.0f, (float) 16766720, (-9.238233E37f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-256) + "'", int3 == (-256));
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
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
        lwjgl3ApplicationConfiguration0.a = 16197090;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-8160), 1.0f, (-1.6473113E38f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1075773696) + "'", int3 == (-1075773696));
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
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
        com.badlogic.gdx.graphics.Color color43 = color21.premultiplyAlpha();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-15728623), (float) (-150), (float) (-41943040));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9792000) + "'", int3 == (-9792000));
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(6528502);
        boolean boolean11 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-100466688));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.0f, (float) 1677721600, (float) 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-128) + "'", int3 == (-128));
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16439278);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-164075620));
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
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
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 0;
        int int21 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-16), (float) (-15514229), (float) (-7936));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16640) + "'", int3 == (-16640));
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-2147418368), (-3060), 2113863936, (-1728));
        int int16 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 31, (float) (-1049600), (-1.9187849E28f), (float) 634911);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-307859744) + "'", int4 == (-307859744));
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-208), (-369098752), 0, (-16));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013907E38f) + "'", float4 == (-1.7013907E38f));
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 653055, 10.0f, (float) 16776961);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-16777216), (float) (-360960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-92044800) + "'", int2 == (-92044800));
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
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
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int15 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int16 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 512;
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 16711680);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowX = 33791;
        lwjgl3ApplicationConfiguration1.b = (-128);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 9);
        com.badlogic.gdx.graphics.Color color26 = color19.set((-4089));
        com.badlogic.gdx.graphics.Color color27 = color19.clamp();
        com.badlogic.gdx.graphics.Color color28 = color27.premultiplyAlpha();
        float float29 = color27.a;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.02745098f + "'", float29 == 0.02745098f);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color29;
        int int31 = com.badlogic.gdx.graphics.Color.rgb888(color29);
        boolean boolean33 = color29.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        com.badlogic.gdx.graphics.Color color44 = color38.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color45 = color29.mul(color44);
        com.badlogic.gdx.graphics.Color color47 = color44.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color44, 9);
        com.badlogic.gdx.graphics.Color color51 = color44.set((-4089));
        com.badlogic.gdx.graphics.Color color52 = color44.clamp();
        com.badlogic.gdx.graphics.Color color53 = color52.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color56 = color24.lerp(color52, (float) (-255));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.stencil = 10;
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration57.initialBackgroundColor = color61;
        lwjgl3ApplicationConfiguration57.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color65 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration57.initialBackgroundColor = color65;
        java.lang.String str67 = color65.toString();
        com.badlogic.gdx.graphics.Color color68 = color24.add(color65);
        int int69 = com.badlogic.gdx.graphics.Color.rgb565(color65);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "000000ff" + "'", str67, "000000ff");
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
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
        lwjgl3ApplicationConfiguration1.windowHeight = 100;
        lwjgl3ApplicationConfiguration1.setwindowMinWidth((-65536));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
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
        com.badlogic.gdx.graphics.Color color37 = color36.cpy();
        com.badlogic.gdx.graphics.Color color39 = color36.set(10);
        java.lang.Class<?> wildcardClass40 = color36.getClass();
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
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.setdepth((-1075773696));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
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
        lwjgl3ApplicationConfiguration1.windowHeight = 100;
        int int20 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-40036));
        int int23 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1621098495 + "'", int20 == 1621098495);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 8, 0.0f, (float) 65535);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16776960 + "'", int18 == 16776960);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 131090400, (float) (-360960), (-1.6880936E38f), (float) 2046);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16255486) + "'", int4 == (-16255486));
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.0f, (float) 514080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 131090400 + "'", int2 == 131090400);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-15514229), 2016, 0, 1677721600, 0, (-16580607), 100);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.g = (-52992);
        lwjgl3ApplicationConfiguration0.setsamples(16197090);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int15 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.windowY = (short) 100;
        int int7 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.6947657E38f), (float) 5959695, (-4.3199905E37f), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1410392064 + "'", int4 == 1410392064);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 234, (float) 1621098495, (float) (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(512);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowWidth = 2046;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int24 = lwjgl3ApplicationConfiguration15.gles30ContextMajorVersion;
        int int25 = lwjgl3ApplicationConfiguration15.getgles30ContextMajorVersion();
        int int26 = lwjgl3ApplicationConfiguration15.getsamples();
        lwjgl3ApplicationConfiguration15.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration15.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration32.setwindowResizable(false);
        lwjgl3ApplicationConfiguration32.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration32.gles30ContextMajorVersion = 0;
        int int47 = lwjgl3ApplicationConfiguration32.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        int int52 = lwjgl3ApplicationConfiguration49.depth;
        lwjgl3ApplicationConfiguration49.windowX = (short) 100;
        lwjgl3ApplicationConfiguration49.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType58 = lwjgl3ApplicationConfiguration49.getpreferencesFileType();
        int int59 = lwjgl3ApplicationConfiguration49.getwindowY();
        lwjgl3ApplicationConfiguration49.samples = 512;
        com.badlogic.gdx.graphics.Color color62 = lwjgl3ApplicationConfiguration49.initialBackgroundColor;
        int int63 = lwjgl3ApplicationConfiguration49.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = lwjgl3ApplicationConfiguration49.hdpiMode;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode64;
        java.lang.Class<?> wildcardClass68 = hdpiMode64.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 16 + "'", int52 == 16);
        org.junit.Assert.assertTrue("'" + fileType58 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType58.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(16613376, 1410392064, 8616705, (-1502683136));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2080210944 + "'", int4 == 2080210944);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.badlogic.gdx.graphics.Color.rgba4444(color0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 1897903, (float) 0, 0.98039216f, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1610676736 + "'", int4 == 1610676736);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-22), (float) (short) -1, 0.9843137f, (float) 16711425);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7008689E38f) + "'", float4 == (-1.7008689E38f));
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(167772160, (-128), (-129024), 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6980888E38f) + "'", float4 == (-1.6980888E38f));
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1049600), (-10223606), (-1504), 2016);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.5950217E38f) + "'", float4 == (-1.5950217E38f));
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color17 = color11.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        com.badlogic.gdx.graphics.Color color19 = color11.set((int) '#');
        com.badlogic.gdx.graphics.Color color24 = color19.set((-8.952473E30f), (float) 653055, (-1.7013859E38f), (float) (-1778519256));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color24;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
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
        int int15 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
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
        float float42 = color38.a;
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
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
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
        boolean boolean22 = lwjgl3ApplicationConfiguration21.windowDecorated;
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-208), (float) (-7936), (float) 607);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-237019999) + "'", int3 == (-237019999));
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 132184352);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.g = 862994742;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int17 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-233897984), (float) (-276908320), (-1.7008689E38f), (float) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13260 + "'", int4 == 13260);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
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
        lwjgl3ApplicationConfiguration1.windowY = 50331648;
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 32256, (float) (-208), (float) (-1), (-1.6980888E38f));
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        int int17 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        boolean boolean19 = color15.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        com.badlogic.gdx.graphics.Color color30 = color24.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color31 = color15.mul(color30);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color15, (int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color15);
        boolean boolean35 = lwjgl3ApplicationConfiguration1.useGL30;
        java.lang.String str36 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-16));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ".prefs/" + "'", str36, ".prefs/");
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-569376768), (float) 8420355, (float) (-587202560), (float) (-447780));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13520608) + "'", int4 == (-13520608));
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-151165028), (float) 43371, (float) 8, (float) 16777216);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        com.badlogic.gdx.graphics.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color9 = color4.lerp(color7, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
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
        lwjgl3ApplicationConfiguration1.windowHeight = 100;
        int int20 = lwjgl3ApplicationConfiguration1.b;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = (-14483712);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        lwjgl3ApplicationConfiguration24.setwindowX((int) (short) 0);
        int int29 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferSize();
        int int30 = lwjgl3ApplicationConfiguration24.windowHeight;
        lwjgl3ApplicationConfiguration24.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration24.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("ffffff00", fileType33);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 480 + "'", int30 == 480);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 2, 9.1655E-41f, 1.06321716E37f, (float) 2147418367);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int8 = lwjgl3ApplicationConfiguration0.b;
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdepth((-29852));
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 1, (-1.1841958E21f), (float) (-17796196));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-551618560) + "'", int3 == (-551618560));
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.g;
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowY = 786400;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int14 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-10188800));
        boolean boolean17 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.windowHeight;
        boolean boolean9 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(16738740);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowWidth(537535241);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int12 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (-1.648194E38f), (float) (-225), (float) (-237));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3091) + "'", int4 == (-3091));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(16766720, 537535241, 14417949, (-551618560));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 184540928 + "'", int4 == 184540928);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
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
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 65535, 40664886);
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-142049825));
        int int21 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int23 = lwjgl3ApplicationConfiguration22.windowX;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.0f), (-2.5901116E33f), (float) (-2865), (float) 16711935);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
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
        int int24 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
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
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.7014117E38f), (float) (-66978332), (float) 63488, (float) (-17796196));
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration16.setvSyncEnabled(false);
        boolean boolean19 = lwjgl3ApplicationConfiguration16.getuseGL30();
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 16);
        color23.a = 0L;
        com.badlogic.gdx.graphics.Color color28 = color21.mul(color23);
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
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color48);
        com.badlogic.gdx.graphics.Color color51 = color23.set(color50);
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color51);
        com.badlogic.gdx.graphics.Color color53 = color14.sub(color51);
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color53);
        com.badlogic.gdx.graphics.Color color55 = color53.clamp();
        int int56 = com.badlogic.gdx.graphics.Color.argb8888(color53);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-16777216) + "'", int56 == (-16777216));
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1.7013859E38f), 1.06321716E37f, (-2.14741837E9f), (float) (-134360));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013859E38f) + "'", float4 == (-1.7013859E38f));
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-250615296), (float) (-250615296), (float) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25500 + "'", int3 == 25500);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 16439278, 0.9843137f, (-8.772646E37f), (float) (-503316225));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.7014117E38f + "'", float4 == 1.7014117E38f);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
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
        boolean boolean34 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int35 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(7680, 28901, 267782144, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 640 + "'", int35 == 640);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        boolean boolean14 = lwjgl3ApplicationConfiguration1.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.9843137f, (float) 62445, (float) 234, (float) (-983040));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-67168768) + "'", int4 == (-67168768));
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-2023680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int3 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int5 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.a = (-6553036);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 512);
        com.badlogic.gdx.graphics.Color color7 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color12 = color7.mul((float) 634911, 2.3509886E-38f, 1.06321716E37f, 0.0f);
        com.badlogic.gdx.graphics.Color color13 = color7.cpy();
        color13.g = 1410392064;
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
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
        com.badlogic.gdx.graphics.Color color62 = color55.mul((float) (-360960));
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
        org.junit.Assert.assertNotNull(color62);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
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
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.stencil = 10;
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration65.initialBackgroundColor = color69;
        com.badlogic.gdx.graphics.Color color75 = color69.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color77 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color79 = color69.lerp(color77, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color79, (-545421065));
        color79.a = 1L;
        com.badlogic.gdx.graphics.Color color88 = color79.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color93 = color88.sub((float) 509920, (-9.238233E37f), (float) (-16), (float) 2);
        java.lang.String str94 = color88.toString();
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color88);
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
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(color79);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "00ffff00" + "'", str94, "00ffff00");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-654724064), (float) (-129024), (float) 28901, (float) (-503341578));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        boolean boolean14 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (byte) 1);
        com.badlogic.gdx.graphics.Color color8 = color1.mul((float) 765, (float) (byte) -1, (float) (short) 100, (float) 100);
        color8.r = (-4.319983E37f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((float) 8616705, (float) (-52344), (float) 63518, (float) 131072);
        com.badlogic.gdx.graphics.Color color16 = color8.mul(color15);
        com.badlogic.gdx.graphics.Color color21 = color8.add((float) (-1), (float) 7680, (float) (-29852), (float) 65536);
        com.badlogic.gdx.graphics.Color color23 = color8.mul((-6.604906E36f));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.b = 100;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
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
        com.badlogic.gdx.graphics.Color color28 = color19.lerp((float) (-100466688), 0.02745098f, (float) 653055, (float) 8616705, (float) (-764808));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
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
        com.badlogic.gdx.graphics.Color color19 = color18.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color18, 63488);
        com.badlogic.gdx.graphics.Color color23 = color18.mul((float) 224);
        float float24 = color18.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00830000");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(1.7014117E38f, 6.1897002E29f, (float) 267782144, (float) (-65025));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(184540928, 8616705, 16777216, 1410392064);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.463949E-32f) + "'", float4 == (-2.463949E-32f));
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int5 = lwjgl3ApplicationConfiguration4.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration4.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.windowResizable;
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        int int7 = lwjgl3ApplicationConfiguration1.windowWidth;
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.0f, (float) 650565, (float) 32, (float) (-16));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6465812E38f) + "'", float4 == (-1.6465812E38f));
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 102, (float) (-40036), (-4.253659E37f), (float) (-6168960));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.3606088E22f) + "'", float4 == (-1.3606088E22f));
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
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
        lwjgl3ApplicationConfiguration1.useVsync(true);
        int int22 = lwjgl3ApplicationConfiguration1.windowX;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1465382614 + "'", int22 == 1465382614);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-2147418368), (float) 8925, (float) (-92044800), (float) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-0.36354828f) + "'", float4 == (-0.36354828f));
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1677721600;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        lwjgl3ApplicationConfiguration0.g = (-256);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        int int9 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        int int10 = lwjgl3ApplicationConfiguration1.r;
        lwjgl3ApplicationConfiguration1.setdepth(607);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-29852), 0, 372608, 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6983845E38f) + "'", float4 == (-1.6983845E38f));
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, 33791);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color13);
        color13.b = (-2147418368);
        color13.g = (-63488);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float13 = color12.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener15);
        boolean boolean17 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int18 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.stencil = 9;
        lwjgl3ApplicationConfiguration1.windowMaxWidth = (-2865);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float13 = color12.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener15);
        boolean boolean17 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int18 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean19 = lwjgl3ApplicationConfiguration1.getuseGL30();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
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
        java.lang.String str17 = lwjgl3ApplicationConfiguration15.title;
        int int18 = lwjgl3ApplicationConfiguration15.windowMaxWidth;
        java.lang.String str19 = lwjgl3ApplicationConfiguration15.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-16777216), (float) (-1077936368), (float) (-59244732), (float) 7048739);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1233169392) + "'", int4 == (-1233169392));
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int21 = lwjgl3ApplicationConfiguration20.getwindowY();
        int int22 = lwjgl3ApplicationConfiguration20.windowMinWidth;
        lwjgl3ApplicationConfiguration20.setgles30ContextMajorVersion(234);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 8, 0.0f, (float) 65535);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        lwjgl3ApplicationConfiguration0.windowMinHeight = 16711935;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1677721600;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        lwjgl3ApplicationConfiguration0.g = (-256);
        int int11 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-2147413088), (float) 634911);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161902304 + "'", int2 == 161902304);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
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
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color38, 255);
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
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
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
        boolean boolean26 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.0f, (-1.6950771E38f), 9.18355E-41f, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        int int15 = lwjgl3ApplicationConfiguration12.b;
        boolean boolean16 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 10, 10);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.useGL30;
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType27);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType29;
        int int32 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-266942944);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 640 + "'", int32 == 640);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-10), (float) 61455, (float) (-208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2320) + "'", int3 == (-2320));
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = '#';
        int int14 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-256);
        java.lang.String str21 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".prefs/" + "'", str21, ".prefs/");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 2147418367, (-4.253659E37f), (float) 2080210944);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
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
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.windowWidth = (byte) 1;
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits(2, (-16580607), 267782144, 786400);
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        lwjgl3ApplicationConfiguration1.windowY = (-59244732);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration1.a;
        int int9 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int11 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-1.5950217E38f), (-1.6880936E38f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-65536);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 131090400, (float) 16738740, (float) (-2147481728), 0.3764706f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(0, 512, (-16), (-16711936));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-917504) + "'", int4 == (-917504));
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
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
        com.badlogic.gdx.graphics.Color color43 = color36.mul((float) (-250615296), (float) (-32), (float) (-6553036), (-1.6960171E38f));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setwindowX((int) (short) -1);
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        int int8 = lwjgl3ApplicationConfiguration1.windowY;
        int int9 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, 862994742);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
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
        lwjgl3ApplicationConfiguration1.setAudioConfig(401539072, (-2865), (-66978332));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 607, (float) '#', (float) (-1), 0.13333334f);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
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
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        int int21 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.depth = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.disableAudio = false;
        lwjgl3ApplicationConfiguration14.setwindowWidth(63151);
        int int19 = lwjgl3ApplicationConfiguration14.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
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
        int int42 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean43 = lwjgl3ApplicationConfiguration0.getwindowResizable();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-256), (float) 6349110, (float) 40664886, (float) 'a');
        com.badlogic.gdx.graphics.Color color5 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color7 = color4.set(2147483647);
        float float8 = color7.b;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-225);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) (-4090624), (float) (byte) 0, (float) 4080);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (byte) 10;
        int int14 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowX = (-15728400);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(0, 2550, (-2320), 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-151390720) + "'", int4 == (-151390720));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.windowMinHeight = 480;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount((-2147483648));
        int int11 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((-1536));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.samples = 61680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(512);
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) 607, 100.0f, 0.0f, (float) 3309388);
        color1.a = 16776961;
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        lwjgl3ApplicationConfiguration0.samples = '4';
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowDecorated;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-15728400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16776961));
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        float float6 = color4.toFloatBits();
        java.lang.String str7 = color4.toString();
        boolean boolean9 = color4.equals((java.lang.Object) (-1.7014117E38f));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.b;
        boolean boolean14 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType15);
        int int17 = lwjgl3ApplicationConfiguration10.depth;
        lwjgl3ApplicationConfiguration10.windowX = 765;
        int int20 = lwjgl3ApplicationConfiguration10.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = lwjgl3ApplicationConfiguration10.hdpiMode;
        java.lang.String str22 = lwjgl3ApplicationConfiguration10.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color4.set(color23);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00000000" + "'", str7, "00000000");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2147483647);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-14483712));
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-545421065));
        color14.a = 1L;
        com.badlogic.gdx.graphics.Color color23 = color14.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color28 = color23.sub((float) 509920, (-9.238233E37f), (float) (-16), (float) 2);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((-40036));
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color35, 16);
        color35.a = 0L;
        com.badlogic.gdx.graphics.Color color40 = color33.mul(color35);
        com.badlogic.gdx.graphics.Color color45 = color33.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color45, 33791);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color49 = color31.sub(color48);
        com.badlogic.gdx.graphics.Color color50 = color31.cpy();
        com.badlogic.gdx.graphics.Color color52 = color30.lerp(color50, (float) 1L);
        com.badlogic.gdx.graphics.Color color57 = color52.mul((float) 63518, (-1.4805586E-33f), 0.0f, (float) 514080);
        com.badlogic.gdx.graphics.Color color58 = color23.sub(color52);
        int int59 = color52.toIntBits();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
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
        com.badlogic.gdx.graphics.Color color24 = color21.set(100);
        com.badlogic.gdx.graphics.Color color29 = color21.add((float) (byte) 100, (float) (short) 0, 0.0f, (-2.647102E-20f));
        float float30 = color29.g;
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((float) '#', (float) (short) -1, (-4.319983E37f), 10.0f);
        com.badlogic.gdx.graphics.Color color40 = color35.add((-1.6947657E38f), (float) 9, (float) (-15), (float) (-16842496));
        com.badlogic.gdx.graphics.Color color41 = color29.set(color40);
        com.badlogic.gdx.graphics.Color color46 = color41.mul((-1.6950771E38f), (float) (-1948738560), (float) 10L, (-5.875603E37f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.g;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setWindowPosition(1953529918, 16776960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ff000000");
        com.badlogic.gdx.graphics.Color color3 = color1.mul((-9.238233E37f));
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
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
        boolean boolean35 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        int int1 = com.badlogic.gdx.graphics.Color.alpha(9.1655E-41f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setsamples((-545421065));
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
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
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color20, (-983040));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (-64));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.samples = 63488;
        lwjgl3ApplicationConfiguration0.stencil = (-129024);
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setwindowX((-480788480));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int5 = lwjgl3ApplicationConfiguration4.audioDeviceBufferSize;
        int int6 = lwjgl3ApplicationConfiguration4.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration4.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00000000", fileType7);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-16776961);
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        color0.r = ' ';
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = color10.mul((float) (-62876));
        color12.a = 16711680;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color12);
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
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color35, 3);
        int int41 = com.badlogic.gdx.graphics.Color.rgb565(color35);
        com.badlogic.gdx.graphics.Color color42 = color12.set(color35);
        com.badlogic.gdx.graphics.Color color43 = color0.set(color35);
        int int44 = com.badlogic.gdx.graphics.Color.rgba4444(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2023680));
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        float float1 = color0.toFloatBits();
        float float2 = color0.r;
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.3199905E37f) + "'", float1 == (-4.3199905E37f));
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 40664886;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        int int26 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        boolean boolean28 = color24.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        com.badlogic.gdx.graphics.Color color39 = color33.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color40 = color24.mul(color39);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color39);
        float float42 = color41.toFloatBits();
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color51 = color44.lerp(color49, (float) 786400);
        int int52 = color51.toIntBits();
        float float53 = color51.b;
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.NAVY;
        color54.g = (short) 10;
        com.badlogic.gdx.graphics.Color color57 = color51.add(color54);
        com.badlogic.gdx.graphics.Color color59 = color41.lerp(color57, (float) 1L);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color41;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65536);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 2.3509886E-38f + "'", float42 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-65536) + "'", int52 == (-65536));
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.9843137f, 0.0f, (float) (-1613299457), (float) (-16776704));
        color4.r = 0.0f;
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-256), (float) 6349110, (float) 40664886, (float) 'a');
        com.badlogic.gdx.graphics.Color color5 = color4.premultiplyAlpha();
        int int6 = com.badlogic.gdx.graphics.Color.rgba4444(color5);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4095 + "'", int6 == 4095);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-16842496), (-250615296), (-321707263), (-40036));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65280) + "'", int4 == (-65280));
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
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
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.b;
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType21 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType21);
        int int23 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowMaxHeight = (short) 10;
        int int26 = lwjgl3ApplicationConfiguration16.g;
        lwjgl3ApplicationConfiguration16.setWindowSizeLimits(16738740, 786400, (int) (byte) -1, 1465382614);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.depth;
        lwjgl3ApplicationConfiguration32.windowX = (short) 100;
        lwjgl3ApplicationConfiguration32.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        lwjgl3ApplicationConfiguration32.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType44 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        int int45 = lwjgl3ApplicationConfiguration32.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration46);
        lwjgl3ApplicationConfiguration47.setWindowPosition((int) (short) 10, 10);
        boolean boolean51 = lwjgl3ApplicationConfiguration47.useGL30;
        int int52 = lwjgl3ApplicationConfiguration47.getwindowY();
        int int53 = lwjgl3ApplicationConfiguration47.samples;
        int int54 = lwjgl3ApplicationConfiguration47.samples;
        com.badlogic.gdx.Files.FileType fileType55 = lwjgl3ApplicationConfiguration47.preferencesFileType;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType55);
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType55);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + fileType55 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType55.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SKY;
        color0.g = 0L;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color11 = color5.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration12.setwindowResizable(false);
        int int23 = lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        int int30 = com.badlogic.gdx.graphics.Color.rgb888(color28);
        boolean boolean32 = color28.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration33.initialBackgroundColor = color37;
        com.badlogic.gdx.graphics.Color color43 = color37.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color44 = color28.mul(color43);
        com.badlogic.gdx.graphics.Color color45 = color43.premultiplyAlpha();
        color43.g = 537535241;
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color43;
        int int49 = color43.toIntBits();
        com.badlogic.gdx.graphics.Color color51 = color11.lerp(color43, (-5.435091E37f));
        com.badlogic.gdx.graphics.Color color52 = color3.set(color11);
        java.lang.Class<?> wildcardClass53 = color11.getClass();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-256) + "'", int49 == (-256));
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 32767, (float) 16776961, (-1.6975328E38f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-55296) + "'", int3 == (-55296));
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-7555886);
        boolean boolean15 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowWidth = 2;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.depth = (byte) 0;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 97;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int29 = lwjgl3ApplicationConfiguration20.gles30ContextMajorVersion;
        int int30 = lwjgl3ApplicationConfiguration20.getgles30ContextMajorVersion();
        int int31 = lwjgl3ApplicationConfiguration20.getsamples();
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration20.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener34;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, (int) 'a');
        color19.r = 0.0f;
        com.badlogic.gdx.graphics.Color color29 = color19.add((float) (-15514229), (float) 14417949, (float) 514080, (float) 862994742);
        float float30 = color19.a;
        float float31 = color19.b;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-622910848);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-16764024), (-2320), 16711425);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25500 + "'", int1 == 25500);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        lwjgl3ApplicationConfiguration1.r = 3;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        int int15 = lwjgl3ApplicationConfiguration12.b;
        boolean boolean16 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode19;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode19);
        boolean boolean22 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 16766720;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-2865), (float) (-307859744), 0.84313726f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-634322729) + "'", int3 == (-634322729));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color color16 = color4.mul((float) 16711680);
        color16.g = 2.3509886E-38f;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, (-1047005184));
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-2089026813), (-1.7011944E38f), (-4.2867603E37f), (-0.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.depth = 8925;
        lwjgl3ApplicationConfiguration0.windowY = (-545421065);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.windowY = 8;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147413088));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setwindowWidth(16738740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setsamples((-16777216));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.windowX;
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((int) (short) 10, (-10), 8616705, 7048739);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7011532E38f) + "'", float4 == (-1.7011532E38f));
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-458762), (float) 4095);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117436161 + "'", int2 == 117436161);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) 0);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = color9.toIntBits();
        org.junit.Assert.assertNotNull(color9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 163200, (float) (-5543167), (float) 704, (float) (-14816));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6948306E38f) + "'", float4 == (-1.6948306E38f));
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.cpy();
        int int25 = com.badlogic.gdx.graphics.Color.rgba4444(color21);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((-2144));
        com.badlogic.gdx.graphics.Color color28 = color21.set(color27);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((float) (-10224128), (float) (-10223606), (float) 1, (float) 10);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color33, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color40;
        int int42 = com.badlogic.gdx.graphics.Color.rgb888(color40);
        boolean boolean44 = color40.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.stencil = 10;
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration45.initialBackgroundColor = color49;
        com.badlogic.gdx.graphics.Color color55 = color49.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color56 = color40.mul(color55);
        com.badlogic.gdx.graphics.Color color58 = color55.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color55, 3);
        com.badlogic.gdx.graphics.Color color62 = color55.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color62, (-40036));
        com.badlogic.gdx.graphics.Color color65 = color62.cpy();
        com.badlogic.gdx.graphics.Color color67 = color65.set((int) 'a');
        com.badlogic.gdx.graphics.Color color69 = color33.lerp(color65, (float) (byte) -1);
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color71, 16);
        com.badlogic.gdx.graphics.Color color79 = color71.lerp((float) (-8160), (float) 1677721600, (-1.4967834E38f), (-5.435091E37f), (-1.7013859E38f));
        com.badlogic.gdx.graphics.Color color80 = new com.badlogic.gdx.graphics.Color(color79);
        com.badlogic.gdx.graphics.Color color81 = color33.set(color79);
        com.badlogic.gdx.graphics.Color color82 = color28.mul(color79);
        int int83 = com.badlogic.gdx.graphics.Color.rgb888(color82);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color79);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 16711927 + "'", int83 == 16711927);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        int int7 = lwjgl3ApplicationConfiguration1.windowMinHeight;
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.disableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        lwjgl3ApplicationConfiguration1.setWindowedMode((-10224128), 1465382614);
        lwjgl3ApplicationConfiguration1.setWindowPosition(102, 863980544);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2144), (float) (-551618560), (float) 65280, (-4.253659E37f));
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.windowY = (short) 100;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setAudioConfig(8616705, 39951, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.windowHeight = 9;
        boolean boolean6 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.setwindowHeight((int) '#');
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 252, (float) 1953529918);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = lwjgl3ApplicationConfiguration0.hdpiMode;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.a = (-40036);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode20;
        int int22 = lwjgl3ApplicationConfiguration16.getwindowHeight();
        int int23 = lwjgl3ApplicationConfiguration16.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration16.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType24;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
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
        float float30 = color29.b;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-503341578), (-1.6983845E38f), (float) (-1948738560), (float) 1677721600);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-14816), (float) '4', (float) 40664886, (float) (-16255486));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-256) + "'", int4 == (-256));
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 255;
        lwjgl3ApplicationConfiguration0.setwindowHeight(1174394321);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.b;
        boolean boolean14 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        lwjgl3ApplicationConfiguration10.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode17;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType19);
        int int21 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 8420355;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        int int1 = com.badlogic.gdx.graphics.Color.alpha(1.203045E-38f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 32767, (float) (-250615296));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8453888) + "'", int2 == (-8453888));
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 25500, (float) (-447780), (float) 131090400, (float) (-569376768));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-538713088) + "'", int4 == (-538713088));
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(553648000);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (short) 1;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-1778519256);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener20;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color();
        int int2 = color1.toIntBits();
        int int3 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color1, 0.0f);
        com.badlogic.gdx.graphics.Color color10 = color1.mul((float) 8, (-1.9187849E28f), (float) (-36880), (float) (-1948738560));
        float float11 = color1.toFloatBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 536870912, (float) 61680, (float) (-548854), (float) 483965280);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
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
        com.badlogic.gdx.graphics.Color color24 = color21.set(100);
        com.badlogic.gdx.graphics.Color color29 = color21.add((float) (byte) 100, (float) (short) 0, 0.0f, (-2.647102E-20f));
        float float30 = color29.g;
        float float31 = color29.toFloatBits();
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color29);
        float float33 = color29.a;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 9.44502E21f + "'", float31 == 9.44502E21f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.39215687f + "'", float33 == 0.39215687f);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
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
        lwjgl3ApplicationConfiguration11.setsamples((-1445928036));
        java.lang.String str15 = lwjgl3ApplicationConfiguration11.preferencesDirectory;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
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
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 640;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-2147481728));
        lwjgl3ApplicationConfiguration1.setwindowWidth((int) (short) 10);
        boolean boolean48 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-16654816));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-52320), (-0.0f), (float) 1671172080, (-1.7013859E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-256) + "'", int4 == (-256));
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int14 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
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
        com.badlogic.gdx.graphics.Color color39 = color38.cpy();
        com.badlogic.gdx.graphics.Color color41 = color38.set(1621098495);
        float float42 = color41.r;
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((float) (-255), (float) 6349110, (float) 1677721600, (float) 512);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color47, 267782144);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color47);
        boolean boolean51 = color41.equals((java.lang.Object) color50);
        int int52 = com.badlogic.gdx.graphics.Color.rgba8888(color41);
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
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.3764706f + "'", float42 == 0.3764706f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1621098495 + "'", int52 == 1621098495);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-15728400));
        boolean boolean22 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        int int12 = lwjgl3ApplicationConfiguration9.b;
        boolean boolean13 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType14 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType14);
        int int16 = lwjgl3ApplicationConfiguration9.depth;
        lwjgl3ApplicationConfiguration9.windowX = 765;
        int int19 = lwjgl3ApplicationConfiguration9.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode20;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-65536);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 4063, 0);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 2032;
        boolean boolean30 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(0.0f, (float) (-551618560), (float) (-503316225), (float) (-2144));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32160) + "'", int4 == (-32160));
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 7680);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-8257792));
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 18005600, (float) (-2105736960), (float) (-65280), 9.1655E-41f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
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
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00000020", fileType32);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowX(650565);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int21 = lwjgl3ApplicationConfiguration20.getwindowY();
        int int22 = lwjgl3ApplicationConfiguration20.depth;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 586415136;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-369098752), (-1.4967834E38f), (float) (-12), (float) (-321707263));
        float float5 = color4.toFloatBits();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, (-15514229));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.setDecorated(false);
        lwjgl3ApplicationConfiguration9.disableAudio(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }
}
