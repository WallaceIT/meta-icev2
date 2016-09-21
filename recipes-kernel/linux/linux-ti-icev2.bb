inherit kernel
require recipes-kernel/linux/linux-yocto.inc

KERNEL_GIT_URI = "git://git.ti.com/ti-linux-kernel/ti-linux-kernel.git"
KERNEL_GIT_PROTOCOL = "git"
BRANCH = "ti-lsk-linux-4.4.y"
SRC_URI = "${KERNEL_GIT_URI};protocol=${KERNEL_GIT_PROTOCOL};branch=${BRANCH} \
	   file://0001-fs-jffs2-Add-setup-code-for-spi-nor-flash.patch \
	   file://0002-ARM-dts-am335x_icev2-full-Linux-configuration.patch \
	   file://0003-ARM-dts-am335x_icev2-add-1wire-node.patch \
	   file://defconfig \
	  "

SRCREV = "${AUTOREV}"

LINUX_VERSION ?= "4.4"
KCONFIG_MODE = "--alldefconfig"

PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_icev2 = "icev2"
