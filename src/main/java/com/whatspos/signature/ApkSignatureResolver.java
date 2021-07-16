package com.whatspos.signature;

/**
 * The interface Apk signature resolver.
 */
public interface ApkSignatureResolver {

    /**
     * Is apk signed based on the apk data.
     *
     * @param apkData the apk data
     * @return the boolean
     */
    boolean isApkSigned(byte[] apkData);

    /**
     * Prepare signature data string send to the signature server based on the apk data.
     *
     * @param apkData the apk data
     * @return the string
     */
    String prepareApkSignatureData(byte[] apkData);

    /**
     * Build signature file based on the work cert and signature returned from the signature server.
     *
     * @param workCert  the work cert
     * @param signature the signature
     * @return the byte [ ]
     */
    byte[] buildApkSignatureFile(byte[] workCert, byte[] signature);

    /**
     * Provider name.
     *
     * @return the name
     */
    String getProviderName();
}
