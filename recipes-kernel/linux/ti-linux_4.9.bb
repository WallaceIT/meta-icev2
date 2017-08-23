require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "icev2"

RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_DEVICETREE_icev2 = "am335x-icev2.dtb"

LINUX_VERSION = "4.9"

FILESEXTRAPATHS_prepend := "${THISDIR}/ti-linux_${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "4.9.44"
SRCREV= "c3148e7628f9dd0fdb237854e7275b5fdc1193db"
SRC_URI = " \
    git://git.ti.com/ti-linux-kernel/ti-linux-kernel.git;branch=ti-linux-4.9.y \
    file://defconfig \
    file://0001-ARM-dts-am335x-icev2-enable-leds-iio-node.patch \
    file://0002-ARM-dts-am335x-icev2-add-ssd1306fb-LCD-node.patch \
    file://0003-fs-jffs2-Add-setup-code-for-spi-nor-flash.patch \
"
