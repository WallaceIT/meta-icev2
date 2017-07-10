require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "icev2"

RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_DEVICETREE_icev2 = "am335x-icev2.dtb"

LINUX_VERSION = "4.9"

FILESEXTRAPATHS_prepend := "${THISDIR}/ti-linux_${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "4.9.36"
SRCREV= "ce1b944a4c612fac33d6befae3f9e0420d087603"
SRC_URI = " \
    git://git.ti.com/ti-linux-kernel/ti-linux-kernel.git;branch=ti-linux-4.9.y \
    file://defconfig \
    file://0001-fs-jffs2-Add-setup-code-for-spi-nor-flash.patch \
"
