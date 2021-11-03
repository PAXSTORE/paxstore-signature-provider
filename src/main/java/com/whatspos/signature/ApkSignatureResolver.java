package com.whatspos.signature;

/**
 * The interface Apk signature resolver.
 */
public interface ApkSignatureResolver {

    /**
     * Check if the application is signed based on the application file.
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
     * This interface is used for validate the uploaded PUK.
     *
     * @param originalSignatureData  the signature data send to the signature server
     * @param decryptedSignatureData the data decrypted by the PUK based on the signed data return from the signature server
     * @return the boolean
     */
    boolean validateEncryptedSignatureData(String originalSignatureData, String decryptedSignatureData);

    /**
     * Provider name.
     *
     * @return the name
     */
    String getProviderName();
}
